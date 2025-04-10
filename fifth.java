import java.util.Scanner;
public class fifth {




        public static void main(String[] args) {
            // Create a scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user for a number
            System.out.print("Enter a number to calculate its factorial: ");
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                // Compute the factorial
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                // Display the result
                System.out.println("The factorial of " + number + " is: " + factorial);
            }

            // Close the scanner
            scanner.close();
        }
    }
