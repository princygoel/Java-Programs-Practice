//WAP to print greatest number 
package IfElsePractice;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		double x = s.nextDouble();
		System.out.println("Enter second number");
		double y = s.nextDouble();
		if(x>y) {
			System.out.println("x is greater than y");
		}
		else {
			System.out.println("x is not greater than y");
		}
		

	}

}
