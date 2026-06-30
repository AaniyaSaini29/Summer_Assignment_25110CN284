import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class TicketBookingSystem {
    private static final TicketingSystem system = new TicketingSystem();
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter INPUT_FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static void main(String[] args) {
        system.loadFromDisk();
        System.out.println("=== Ticket Booking System ===");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": createEvent(); break;
                case "2": listEvents(); break;
                case "3": viewSeatMap(); break;
                case "4": bookSeats(); break;
                case "5": cancelBooking(); break;
                case "6": viewBooking(); break;
                case "7": listBookingsByPhone(); break;
                case "8": cancelEvent(); break;
                case "9": listAllBookings(); break;
                case "0":
                    system.saveToDisk();
                    System.out.println("Data saved. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Create Event");
        System.out.println("2. List Events");
        System.out.println("3. View Seat Map for an Event");
        System.out.println("4. Book Seats");
        System.out.println("5. Cancel Booking");
        System.out.println("6. View Booking Details");
        System.out.println("7. List Bookings by Phone Number");
        System.out.println("8. Cancel Event");
        System.out.println("9. List All Bookings");
        System.out.println("0. Save & Exit");
        System.out.print("Choose an option: ");
    }

    private static String prompt(String label) {
        System.out.print(label);
        return scanner.nextLine().trim();
    }

    private static int promptInt(String label) {
        while (true) {
            try {
                return Integer.parseInt(prompt(label));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static double promptDouble(String label) {
        while (true) {
            try {
                double v = Double.parseDouble(prompt(label));
                if (v < 0) { System.out.println("Must be non-negative."); continue; }
                return v;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // ---------- Event actions ----------

    private static void createEvent() {
        String name = prompt("Event name: ");
        String venue = prompt("Venue: ");
        LocalDateTime dateTime = null;
        while (dateTime == null) {
            try {
                dateTime = LocalDateTime.parse(prompt("Date & time (yyyy-MM-dd HH:mm): "), INPUT_FMT);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Example: 2026-08-15 19:30");
            }
        }
        int rows = promptInt("Number of rows: ");
        int seatsPerRow = promptInt("Seats per row: ");
        double basePrice = promptDouble("Base ticket price ($): ");

        Event event = system.createEvent(name, venue, dateTime, rows, seatsPerRow, basePrice);
        System.out.println("Event created! Event ID: " + event.getEventId()
                + " | Total seats: " + event.getSeats().size());
        System.out.println("(Row A = VIP, rows B-C = PREMIUM, remaining rows = REGULAR)");
    }

    private static void listEvents() {
        if (system.getAllEvents().isEmpty()) {
            System.out.println("No events scheduled.");
            return;
        }
        System.out.println("\nID       | Name                      | Venue                | Date & Time      | Available");
        System.out.println("-".repeat(100));
        for (Event e : system.getAllEvents()) {
            System.out.println(e);
        }
    }

    private static void viewSeatMap() {
        Event event = findEvent();
        if (event == null) return;

        System.out.println("\nSeat map for " + event.getName() + " (" + event.getEventId() + "):");
        String currentRow = "";
        StringBuilder line = new StringBuilder();
        for (Seat seat : event.getSeats().values()) {
            String rowLetter = seat.getSeatId().replaceAll("[0-9]", "");
            if (!rowLetter.equals(currentRow)) {
                if (line.length() > 0) System.out.println(line);
                line = new StringBuilder();
                currentRow = rowLetter;
            }
            String marker = seat.isBooked() ? "[X]" : "[ ]";
            line.append(marker).append(seat.getSeatId()).append(" ");
        }
        if (line.length() > 0) System.out.println(line);
        System.out.println("Legend: [ ]=Free  [X]=Booked");
        System.out.println("Categories & prices:");
        Set<String> shown = new HashSet<>();
        for (Seat seat : event.getSeats().values()) {
            String key = seat.getCategory().toString();
            if (shown.add(key)) {
                System.out.printf("  %-8s $%.2f%n", seat.getCategory(), seat.getPrice());
            }
        }
    }

    private static void bookSeats() {
        Event event = findEvent();
        if (event == null) return;

        String name = prompt("Customer name: ");
        String phone = prompt("Customer phone: ");
        String seatsInput = prompt("Seat ID(s), comma-separated (e.g. A1,A2): ");
        List<String> seatIds = new ArrayList<>();
        for (String s : seatsInput.split(",")) {
            String trimmed = s.trim();
            if (!trimmed.isEmpty()) seatIds.add(trimmed);
        }

        String result = system.bookSeats(event.getEventId(), name, phone, seatIds);
        System.out.println(result);
    }

    private static void cancelBooking() {
        String bookingId = prompt("Booking ID to cancel: ");
        System.out.println(system.cancelBooking(bookingId));
    }

    private static void viewBooking() {
        String bookingId = prompt("Booking ID: ");
        Booking b = system.getBooking(bookingId);
        if (b == null) {
            System.out.println("Booking not found.");
        } else {
            System.out.println(b);
        }
    }

    private static void listBookingsByPhone() {
        String phone = prompt("Customer phone: ");
        List<Booking> results = system.getBookingsByPhone(phone);
        if (results.isEmpty()) {
            System.out.println("No bookings found for this phone number.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private static void cancelEvent() {
        String eventId = prompt("Event ID to cancel: ");
        boolean ok = system.cancelEvent(eventId);
        System.out.println(ok
                ? "Event cancelled. All associated bookings have been cancelled."
                : "Event not found.");
    }

    private static void listAllBookings() {
        if (system.getAllBookings().isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        system.getAllBookings().forEach(System.out::println);
    }

    // ---------- Helper ----------

    private static Event findEvent() {
        String eventId = prompt("Event ID: ");
        Event event = system.getEvent(eventId);
        if (event == null) {
            System.out.println("Event not found.");
        }
        return event;
    }
}
