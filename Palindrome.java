/* Write java code to determine if the string is a palindrome.
	  Input String : Madam 
	 Output : Madam is a Palindrome */

package javaPracticeQuestions;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Removing spaces and converting to lowercase for case-insensitivity
		String cleanInput = input.replaceAll("\\s", "").toLowerCase();

		// Checking if cleaned string is a palindrome
		if (isPalindrome(cleanInput)) {
			System.out.println(input + " is a Palindrome");
		} else {
			System.out.println(input + " is not a Palindrome");
		}
	}

	// Checking if string is palindrome
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false; // Characters do not match
			}
			left++;
			right--;
		}
		return true; // All characters matched, it's a palindrome
	}
}
