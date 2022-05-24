
package IfElsePractice;

public class Demo1 {

	public static void main(String[] args) {
		double marks = 4.5;
		student(marks);

	}
	
	public static void student(double marks) {
		if(marks < 30 ) {
			System.out.println("Fail");
		}
		else if(marks >= 30 && marks <= 40) {
			System.out.println("C");
		}
		else if(marks > 40 && marks <= 60) {
			System.out.println("B");
		}
		else if(marks > 60 && marks <= 80) {
			System.out.println("A");
		}
		else if(marks >80 && marks <= 100) {
			System.out.println("A+");
		}
		else {
			System.out.println("Wrong calculation");
			
		}
		
	}

}
