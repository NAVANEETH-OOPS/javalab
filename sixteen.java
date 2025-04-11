import java.util.Scanner;
public class sixteen {



        public static void main(String[] args) {
            // Create Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Input the year from user
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // Close the scanner
            scanner.close();
        }
    }
