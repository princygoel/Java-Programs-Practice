package IfElsePractice;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = s.next().charAt(0);
		checkCase(ch);

	}
	public static void checkCase(char ch) {
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch+" is upper case");
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch+" is lower case");
		}
		else {
			System.out.println(ch+" is not an alphabet");
		}
	}

}
