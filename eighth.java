import java.util.Scanner;
public class eighth {




        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user for a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Variable to store the reversed number
            int reversedNumber = 0;

            // Loop to reverse the digits of the number
            while (number != 0) {
                int digit = number % 10;          // Get the last digit
                reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
                number = number / 10;             // Remove the last digit
            }

            // Display the reversed number
            System.out.println("Reversed number: " + reversedNumber);

            // Close the scanner
            scanner.close();
        }
    }

