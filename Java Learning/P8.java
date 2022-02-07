//Swapping two numbers

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number-");
		int a=sc.nextInt();
		System.out.println("Enter the Second number-");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping: a=" + a +",b=" + b);
		
		int x=a+b;
		a=x-a;
		b=x-b;
		
		System.out.println("After Swapping: a=" + a +",b=" + b);

	}

}
