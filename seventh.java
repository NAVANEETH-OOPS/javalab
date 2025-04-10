import java.util.Scanner;
public class seventh {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter how many Fibonacci numbers to display
            System.out.print("Enter the number of Fibonacci terms to display: ");
            int n = scanner.nextInt();

            // Check for valid input
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("The first " + n + " Fibonacci numbers are:");

                int first = 0, second = 1;

                for (int i = 1; i <= n; i++) {
                    System.out.print(first + " ");

                    // Compute the next term
                    int next = first + second;
                    first = second;
                    second = next;
                }
            }

            scanner.close();
        }
    }
