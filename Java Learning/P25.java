import java.util.Scanner;

public class P25 {
	
	double avgNum(double a, double b, double c) {
		 return (a+b+c)/3;
	}

	public static void main(String[] args) {
		P25 obj=new P25();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		double a=sc.nextInt();
		System.out.print("\nEnter the Second Number: ");
		double b=sc.nextInt();
		System.out.print("\nEnter the Third Number: ");
		double c=sc.nextInt();
		
		double avg=obj.avgNum(a, b, c);
		System.out.println("The average of three numbers is: " + avg);

	}

}
