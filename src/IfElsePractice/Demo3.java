//WAP to print even or odd number
package IfElsePractice;

public class Demo3 {

	public static void main(String[] args) {
	   	double num = 10000;
	   	checknumber(num);
	}
	
	public static void checknumber(double num) {
		if(num%2 == 0) {
			System.out.println("Number is even");
			
		}
		else 
		{
			System.out.println("Number is odd");
		}
	}

}
