// switch statements

import java.util.Scanner;

public class P17 {
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Grade-");
		char grade=sc.next().charAt(0);
		
		switch (grade) {
		 case 'A':
		 System.out.println("You got an A. Awesome!");
		 break;
		 case 'B':
		 System.out.println("You got a B. Beautiful!");
		 break;
		 case 'C':
		 System.out.println("You got a C. Concerning!");
		 break;
		 case 'D':
		 System.out.println("You got a D. Very Poor!");
		 break;
		 default:
		 System.out.println("You got an F. You'll do well in Congress!");
		}
	}
}