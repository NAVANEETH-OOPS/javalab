import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class seventeen {


        public static void main(String[] args) {
            // Create Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Read the string from the console
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            // Split the string into words using space as the delimiter
            String[] words = input.split("\\s+");

            // Create a map to store the word counts
            Map<String, Integer> wordCountMap = new HashMap<>();

            // Loop through each word and update the word count in the map
            for (String word : words) {
                // Convert word to lowercase to make the count case-insensitive
                word = word.toLowerCase();

                // If the word is already in the map, increment its count; otherwise, add it with a count of 1
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }

            // Display the word count for each word
            System.out.println("\nWord Occurrences:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Close the scanner
            scanner.close();
        }
    }
