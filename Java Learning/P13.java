//Print true if x is a positive and odd number

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-");
		int x=sc.nextInt();
		
		if(x>=0 && x%2 == 1)
			System.out.println("True");
		else
			System.out.println("False");

	}

}
