public class second {


        public static void main(String[] args) {
            // Check if command line arguments are provided
            if (args.length == 0) {
                // If no arguments, print the default message
                System.out.println("Java is an object-oriented programming language");
            } else {
                // Print the arguments provided
                System.out.println(args[0]);
            }
        }
    }
