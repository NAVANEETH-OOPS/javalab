import java.util.Scanner;
public class tenth {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // String to int conversion
            System.out.print("Enter a number (as a string): ");
            String numberStr = scanner.nextLine();
            int number = Integer.parseInt(numberStr);  // String to int

            // int to String conversion
            String convertedStr = Integer.toString(number);  // int to String

            // String to double conversion
            System.out.print("Enter a decimal value (as a string): ");
            String decimalStr = scanner.nextLine();
            double decimal = Double.parseDouble(decimalStr);  // String to double

            // double to String conversion
            String doubleToStr = String.valueOf(decimal);  // double to String

            System.out.println("\nType Conversion Results:");
            System.out.println("String to int: " + number);
            System.out.println("int to String: " + convertedStr);
            System.out.println("String to double: " + decimal);
            System.out.println("double to String: " + doubleToStr);

            scanner.close();
        }
    }

