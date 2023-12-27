/* Write a program to input two numbers and find maximum 
between two numbers using the conditional/ternary operator. */

package javaPracticeQuestions;

import java.util.Scanner;

public class MaximumBetweenTwoNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();

		// Findin maximum sing the ternary operator
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + max);
	}
}
