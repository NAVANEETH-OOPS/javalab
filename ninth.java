public class ninth {

        public static void main(String[] args) {

            // Implicit Typecasting (Widening Conversion)
            int intVal = 100;
            long longVal = intVal;       // int to long
            float floatVal = longVal;    // long to float

            System.out.println("Implicit Typecasting:");
            System.out.println("int value: " + intVal);
            System.out.println("long value (from int): " + longVal);
            System.out.println("float value (from long): " + floatVal);

            // Explicit Typecasting (Narrowing Conversion)
            double doubleVal = 123.456;
            int narrowedInt = (int) doubleVal;  // double to int

            System.out.println("\nExplicit Typecasting:");
            System.out.println("double value: " + doubleVal);
            System.out.println("int value (from double): " + narrowedInt);

            // Another example: byte overflow
            int bigInt = 130;
            byte smallByte = (byte) bigInt;  // int to byte, may overflow

            System.out.println("\nTypecasting with possible overflow:");
            System.out.println("int value: " + bigInt);
            System.out.println("byte value (from int): " + smallByte);  // output will be -126
        }
    }

