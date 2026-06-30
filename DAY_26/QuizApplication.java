
import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] questions = {
            "What is the capital of Japan?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal in the world?",
            "Who wrote 'Hamlet'?"
        };
        
        String[][] options = {
            {"A. Beijing", "B. Seoul", "C. Tokyo", "D. Bangkok"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. Elephant", "B. Blue Whale", "C. Giraffe", "D. Orca"},
            {"A. Charles Dickens", "B. Jane Austen", "C. Mark Twain", "D. William Shakespeare"}
        };
        
        char[] answers = {'C', 'B', 'B', 'D'};
        
        int score = 0;

        System.out.println("Welcome to the Trivia Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            char userAnswer = ' ';
            boolean validInput = false;
            
            while (!validInput) {
                System.out.print("Enter your answer (A, B, C, or D): ");
                String input = scanner.nextLine().trim().toUpperCase();
                
                if (input.length() == 1 && (input.charAt(0) == 'A' || input.charAt(0) == 'B' || input.charAt(0) == 'C' || input.charAt(0) == 'D')) {
                    userAnswer = input.charAt(0);
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter A, B, C, or D.");
                }
            }
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i] + ".\n");
            }
        }

        System.out.println("--- Quiz Complete ---");
        System.out.println("Your final score is " + score + " out of " + questions.length);
        
        double percentage = ((double) score / questions.length) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);
        
    }
}