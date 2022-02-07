//Prints true if x and y have same sign

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number-");
		int x=sc.nextInt();
		System.out.println("Enter the second number-");
		int y=sc.nextInt();
		
		if(x>=0 && y>=0 || x<0 && y<0)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
