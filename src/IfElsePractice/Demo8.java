/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user Number of classes held
Number of classes attended. And print percentage of class attended
Is student is allowed to sit in exam or not.*/

//Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.


package IfElsePractice;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Number of classes held");
		int class_Held = s.nextInt();
		System.out.println("Number of classes attended");
		int class_Attended = s.nextInt();
		System.out.println("Do you have medical issue");
		boolean medicalIssue = s.nextBoolean();
		studentCheck(class_Held,class_Attended,medicalIssue);
	}
	public static void studentCheck(int class_Held,int class_Attended, boolean medicalIssue) {
		int percentAttend = (class_Attended*100/class_Held);
		if(percentAttend<75) {
			
			if(medicalIssue) 
			{
				System.out.println("You are allowed to sit because of medical certificate");
			}
			else {
				System.out.println("Student percentage is "+percentAttend+"% .You are not allowed to sit");
			}
		}
		else {
			System.out.println("Student percentage is "+percentAttend+"% .You are allowed to sit");
		}
	}

}
