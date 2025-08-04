package problemsolving;
import java.util.*;
public class Text {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a sentence:");
	        String text = scanner.nextLine();

	        // Convert text to lowercase & remove punctuation for consistent counting
	        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");

	        // Split by spaces to get words
	        String[] words = text.split("\\s+");

	        // Count total words
	        System.out.println("Total words: " + words.length);

	        // Count occurrences of each word using HashMap
	        Map<String, Integer> wordCount = new HashMap<>();
	        for (String word : words) {
	            if (word.isEmpty()) continue; // skip empty words if any
	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	        }

	        System.out.println("Word occurrences:");
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        scanner.close();
	    }
	}



