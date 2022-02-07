// Buying and Selling commodities

import java.util.Scanner;

public class P18 {
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Balance:");
		int balance=sc.nextInt();
		System.out.println("Enter the Quantity:");
		int quantity=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter whether you want to Buy or Sell:");
		String command=sc1.nextLine();
		
		
		switch (command) {
		case "Buy":
			quantity += 5;
			balance -= 20;
			break;
		case "Sell":
			quantity -= 5;
			balance += 15;
		}
		
		System.out.println("Balance : $" + balance + "\nQuantity : " + quantity);
	}
}
