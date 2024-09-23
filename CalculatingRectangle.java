package CalculatingRectangle;

import java.util.Scanner; // Importing Scanner class

// CC2-1B Saldua, Gio Brix R. 16/09/2024

public class CalculatingRectangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the length:
        System.out.print("Enter the length of the rectangle in meters: ");
        double length = scanner.nextDouble();  // Read user input for length

        // Prompt user for the width:
        System.out.print("Enter the width of the rectangle in meters: ");
        double width = scanner.nextDouble();  // Read user input for width

        // Calculations:
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Output:
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Area: " + area + " square meters");
        System.out.println("Perimeter: " + perimeter + " meters");

        // Close the scanner to prevent resource leak:
        scanner.close();
    }
}
