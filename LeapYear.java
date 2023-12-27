//Write a program to check leap year using if else.

package javaPracticeQuestions;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
			
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the year : ");
				
		int year = sc.nextInt();
				
		// Checking leap year or not
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("The Year "+year+ " is a leap year");
		}else {
			System.out.println("The Year "+year+ " is not a leap year");
			}
	
	}

}
