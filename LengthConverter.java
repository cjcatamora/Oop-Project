// Import Scanner class to get user input
import java.util.Scanner;
// Main class of the program
public class LengthConverter {
    // Main method where the program starts
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Variable to store the height in centimeters
        int heightCm = 0;
        // Loop to keep asking input until valid data is entered
        while (true) {
            try {
                // Prompt the user to enter height in centimeters
                System.out.print("Enter your height in centimeters: ");
                // Read input as String and convert it to integer
                heightCm = Integer.parseInt(sc.nextLine());
                // Check if the entered value is positive
                if (heightCm <= 0) {
                    // Display error message if input is zero or negative
                    System.out.println("Height must be a positive number. Try again.");
                } else {
                    // Exit the loop if input is valid
                    break;
                }
            } catch (NumberFormatException e) {
                // Catch error if input is not a number
                System.out.println("Invalid input! Please enter a numeric value.");
            }
        }
        // Convert centimeters to total inches
        double totalInches = heightCm / 2.54;
        // Calculate feet from total inches
        int feet = (int) totalInches / 12;
        // Calculate remaining inches and round it
        int inches = (int) Math.round(totalInches % 12);
        // Adjust if inches become exactly 12 after rounding
        if (inches == 12) {
            feet++;        // Add 1 foot
            inches = 0;    // Reset inches to 0
        }
        // Display the final converted height in feet and inches
        System.out.println(
            "Your height in feet and inches is: " + feet + "'" + inches + "\""
        );
        // Close the Scanner object
        sc.close();
    }
}
