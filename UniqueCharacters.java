/* You need to find and print all the unique characters in a given string.
        Input string : java  
        Output : jav  */

package javaPracticeQuestions;

import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {

		String input = "java";

		String uniqueCharacters = findUniqueCharacters(input);
		System.out.println("Input string: " + input);
		System.out.println("Unique characters: " + uniqueCharacters);
	}

	public static String findUniqueCharacters(String str) {
		Set<Character> uniqueCharsSet = new HashSet<>();
		StringBuilder result = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (uniqueCharsSet.add(ch)) {
				result.append(ch);
			}
		}

		return result.toString();
	}
}
