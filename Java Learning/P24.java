import java.util.Scanner;

public class P24 {
	
	double circumCircle(double r) {
		return 2*Math.PI*r;
	}
	
	double areaofCircle(double r) {
		return Math.PI*r*r;
	}

	public static void main(String[] args) {
		
		P24 obj=new P24();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of cicle: ");
		double r=sc.nextDouble();
		double c = obj.circumCircle(r);
		double ar = obj.areaofCircle(r);
		System.out.println("The circumference of circle is: " + c);
		System.out.println("The area of circle is: " + ar);
		
	}

}
