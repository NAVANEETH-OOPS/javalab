import java.util.Scanner;
public class sixth {




        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter an integer
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            int originalNumber = number; // Store original number for display
            int sum = 0;

            // Convert negative number to positive
            number = Math.abs(number);

            // Loop to extract digits and compute the sum
            while (number > 0) {
                int digit = number % 10; // Get last digit
                sum += digit;            // Add digit to sum
                number = number / 10;    // Remove last digit
            }

            // Display result
            System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

            // Close scanner
            scanner.close();
        }
    }
