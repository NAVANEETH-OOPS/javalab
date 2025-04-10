public class third {


        public static void main(String[] args) {
            // Check if two arguments are passed
            if (args.length != 2) {
                System.out.println("Please provide two numbers as command line arguments.");
                return;
            }

            try {
                // Parse command line arguments as doubles (to handle floating-point values)
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);

                // Perform arithmetic operations
                double sum = num1 + num2;
                double difference = num1 - num2;
                double product = num1 * num2;
                double quotient = (num2 != 0) ? num1 / num2 : Double.NaN; // Avoid division by zero

                // Display results
                System.out.println("First Number: " + num1);
                System.out.println("Second Number: " + num2);
                System.out.println("Addition: " + sum);
                System.out.println("Subtraction: " + difference);
                System.out.println("Multiplication: " + product);
                if (quotient != Double.NaN) {
                    System.out.println("Division: " + quotient);
                } else {
                    System.out.println("Division: Cannot divide by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numeric values.");
            }
        }
    }
