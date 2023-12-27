//Write a program to check whether a number is a Strong number or not. 
//For example: 145 is a strong number.Since, 1! + 4! + 5! = 145

package javaPracticeQuestions;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int originalNumber = sc.nextInt();
		
		// Storing original number into another variable
		int temp = originalNumber;
		int sum = 0;
		while(originalNumber > 0) {
			int rem = originalNumber % 10;
			sum += factorial(rem);
			originalNumber /= 10; 
		}
		// Condition for Strong Number
		if(temp == sum) {
			System.out.println("The number " + temp + " is a strong number ");
			System.out.println("Sum of factorial of digits : " + sum);
		}else {
			System.out.println("The number " + temp + " is not a strong number ");
			System.out.println("Sum of factorial of digits : " + sum);
		}
	}
	// Factorial Method 
	private static int factorial(int a){
		int fact = 1;
		for(int i = 1 ; i <= a ; i++) {
			fact *= i;
		}
		return fact;
	}

}