
/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/


package IfElsePractice;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity = s.nextInt();
		double discount;
		double discounted_cost;
		int cost = quantity*100;
		if((cost)>1000) {
			discount = 0.1*quantity*100;
			discounted_cost = cost-discount;
			System.out.println("You get a discount of "+discount+ " and total cost would be "+discounted_cost);
		}
		else {
			System.out.println("No discount");
		}
		
	}

}
