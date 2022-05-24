//Take input of age of 3 people by user and determine oldest and youngest among them.

package IfElsePractice;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First person age");
		int age1 = s.nextInt();
		System.out.println("Enter Second person age");
		int age2 = s.nextInt();
		System.out.println("Enter Third person age");
		int age3 = s.nextInt();
		checkAge(age1, age2, age3);
	}

	public static void checkAge(int age1, int age2, int age3) {
		if (age1 > age2 && age1 > age3) {
			System.out.println("First person is the oldest");
		}

		else if (age2 > age1 && age2 > age3) {
			System.out.println("Second person is the oldest");
		}

		else {
			System.out.println("Third person is the oldest");
		}
	
	if (age1 < age2 && age1 < age3) {
		System.out.println("First person is the younest");
	}

	else if (age2 < age1 && age2 < age3) {
		System.out.println("Second person is the youngest");
	}

	else {
		System.out.println("Third person is the youngest");
	}
}
	

}
