import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        // Infinite loop until user inputs "STOP"
        while (true) {
            // Ask the user for input
            System.out.println("Enter a decimal number to convert to binary (or type 'STOP' to quit): ");
            input = scanner.nextLine().trim(); // Read the input and remove any leading or trailing whitespace
            
            // Check if the user wants to stop the program
            if (input.equalsIgnoreCase("STOP")) {
                System.out.println("Program terminated.");
                break; // Exit the loop and terminate the program
            }
            
            try {
                // Convert the input to an integer and calculate its binary equivalent
                int decimalNumber = Integer.parseInt(input); // Parse input to an integer
                String binaryString = Integer.toBinaryString(decimalNumber); // Convert decimal to binary
                System.out.println("Binary of " + decimalNumber + " is: " + binaryString);
            } catch (NumberFormatException e) {
                // If the input is not a valid number, show an error message
                System.out.println("Invalid input! Please enter a valid decimal number.");
            }
        }
        
        scanner.close(); // Close the scanner
    }
}