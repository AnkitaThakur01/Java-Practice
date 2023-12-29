/* You need to find and print all the unique characters in a given string.
        Input string : java  
        Output : jav  */

package javaPracticeQuestions;

import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();

        //HashMap to store characters and their counts
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

        // If the character is already in the HashMap, increment its count
			if (hm.containsKey(ch)) {
				int a = hm.get(ch);
				int b = a + 1;
				hm.put(ch, b);
			} else {
				hm.put(ch, 1);
			}
		}
        // Create a StringBuilder to store unique characters
		StringBuilder uniqueChars = new StringBuilder();

        // Iterate through the characters in the HashMap
		for (char c : hm.keySet()) {
			if (hm.get(c) == 1) {
				uniqueChars.append(c);
			}
		}

		System.out.println("Unique characters: " + uniqueChars.toString());

	}

}