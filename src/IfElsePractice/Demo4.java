// WAP to check if window seat is available with food / or not

package IfElsePractice;

public class Demo4 {
	
	public static void main(String[] args) {
		String ticket = "abcdef";
		boolean food = true;
		boolean windowSeat = true;
		checkTicket(ticket, windowSeat, food);
	}

	public static void checkTicket(String ticket, boolean windowSeat, boolean food) {
		if (ticket == "abcdef") {
			if (windowSeat) {
				System.out.println("This is window seat");
				if (food) {
					System.out.println("This is premium seat");
				}else {
					System.out.println("This is not a premium seat");
				}
			}else {
				System.out.println("This is not a window seat");

			}
		} else  {
			System.out.println("Ticket not found");
		}
	}
}
