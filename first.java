import java.util.Arrays;
public class first {


        public static void main(String[] args) {
            // Sample array
            int[] array = { 5, 2, 9, 1, 5, 6 };

            // Print original array
            System.out.println("Original Array: " + Arrays.toString(array));

            // Sorting the array
            Arrays.sort(array);

            // Print sorted array
            System.out.println("Sorted Array: " + Arrays.toString(array));
        }
    }
