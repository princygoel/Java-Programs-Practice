
/* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/

package IfElsePractice;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter salary");
        long salary = s.nextLong();
        System.out.println("Enter year of service");
        int year = s.nextInt();
       // long bonus = 0;
        checkBonus(salary,year);
	}
	public static void checkBonus(long salary, int year) {
		if(year>=5) {
			long bonus = (5*salary)/100;
			System.out.println("Net bonus amount is "+bonus);
		}
		else {
			System.out.println("No bonus");
		}
	}

}
