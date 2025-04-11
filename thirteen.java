import java.util.Arrays; // Importing Arrays class for sorting
public class thirteen {



        public static void main(String[] args) {

            // Sample array of integers
            int[] numbers = {34, 12, 8, 57, 19, 99, 3};

            System.out.println("Original Array:");
            // Display the original array
            printArray(numbers);

            // Sorting the array using Arrays.sort() method
            Arrays.sort(numbers);

            System.out.println("\nSorted Array (Ascending Order):");
            // Display the sorted array
            printArray(numbers);

            // For descending order, we need to sort in reverse order
            System.out.println("\nSorted Array (Descending Order):");
            // Sorting in reverse order by using a simple technique
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Helper method to print array elements
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println(); // Newline for better readability
        }
    }
