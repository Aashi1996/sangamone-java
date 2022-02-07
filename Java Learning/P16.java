//Print true if both numbers are positive

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the First number-");
			int x=sc.nextInt();
			System.out.println("Enter the Second number-");
			int y=sc.nextInt();
			
			if(x>0 && y>0)
				System.out.println("True");
			else
				System.out.println("False");

	}

}
