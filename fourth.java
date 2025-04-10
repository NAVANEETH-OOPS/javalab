public class fourth {


        public static void main(String[] args) {
            // Check if any arguments are passed
            if (args.length == 0) {
                System.out.println("Please provide numbers to add.");
                return;
            }

            double sum = 0;

            // Loop through the arguments and sum them
            for (String arg : args) {
                try {
                    // Convert each argument to a double and add it to the sum
                    sum += Double.parseDouble(arg);
                } catch (NumberFormatException e) {
                    // If any argument is not a valid number, display an error message
                    System.out.println("Invalid input: " + arg + " is not a valid number.");
                    return;
                }
            }

            // Display the sum of the numbers
            System.out.println("The sum of the numbers is: " + sum);
        }
    }
