import java.util.Scanner;
public class eleventh {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get two numbers from the user
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Use boolean variables to compare the numbers
            boolean isEqual = (a == b);
            boolean isAGreater = (a > b);
            boolean isBLessOrEqual = (b <= a);

            System.out.println("\nBoolean Results:");
            System.out.println("Are the numbers equal? " + isEqual);
            System.out.println("Is the first number greater than the second? " + isAGreater);
            System.out.println("Is the second number less than or equal to the first? " + isBLessOrEqual);

            // Logical operations
            boolean bothPositive = (a > 0) && (b > 0);
            boolean atLeastOnePositive = (a > 0) || (b > 0);

            System.out.println("\nLogical Operations:");
            System.out.println("Are both numbers positive? " + bothPositive);
            System.out.println("Is at least one number positive? " + atLeastOnePositive);

            // Using NOT operator
            boolean isANotPositive = !(a > 0);
            System.out.println("Is the first number NOT positive? " + isANotPositive);

            scanner.close();
        }
    }
