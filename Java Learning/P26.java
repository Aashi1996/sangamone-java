import java.util.Scanner;

public class P26 {
	
	int getTotal(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		P26 obj = new P26();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c=obj.getTotal(a, b);
		System.out.println("The sum of two numbers is: " + c);
	}

}
