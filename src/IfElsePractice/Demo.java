package IfElsePractice;

public class Demo {

	public static void main(String[] args) {
		int year = 1610;
		checkleapyear(year);
	}
	public static void checkleapyear(int year) {
		
		if(year%4 == 0) {
			System.out.println(year+" is a leap year");
			
		}
		else if(year%100 ==0) {
			System.out.println(year+" is not a leap year");
		}
		else if(year%400 ==0){
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is a not leap year");
		}
	}

}
