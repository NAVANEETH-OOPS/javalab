public class twelvth {


        // Global (Instance) variable
        static int globalVar = 10;

        public static void main(String[] args) {

            // Local variable inside the main method
            int localVar = 20;

            System.out.println("Global variable (accessible anywhere in the class): " + globalVar);
            System.out.println("Local variable (within main method): " + localVar);

            // Calling another method that uses a local variable
            methodScopeExample();

            // Local variable inside a loop
            for (int i = 0; i < 3; i++) {
                // The 'i' variable is only accessible inside the loop
                System.out.println("Loop iteration: " + i);
            }

            // Uncommenting the next line will cause an error,
            // because 'i' is out of scope outside the loop.
            // System.out.println("Outside loop: " + i); // Error: i cannot be resolved
        }

        // A method that demonstrates scope and lifetime of local variables
        public static void methodScopeExample() {
            // Local variable within method
            int methodVar = 50;

            System.out.println("Local variable inside method: " + methodVar);
            System.out.println("Global variable (accessible in the method): " + globalVar);

            // Local variables inside the method are only accessible within the method
            // System.out.println("Trying to access localVar: " + localVar); // Error: localVar cannot be resolved
        }
    }


