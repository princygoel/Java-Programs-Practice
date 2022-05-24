package IfElsePractice;

public class Demo0 {
  
   
   public static void main(String[] princy) {
	   int age = 1000;
	   boolean check = ageVerify(age);
	   if(check) {
		System.out.println("You are eligible for vote");
	}
   else {
	   System.out.println("You are not eligible for vote");
   }
  }

	  
	  public static boolean ageVerify(int age) {
		  if(age >= 18) {
			  return true;
		  }
		  else {
			  return false;
		  }
		  
		  
	  }
  

}
