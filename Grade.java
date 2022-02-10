import java.util.Scanner;

/*A school has the following rules for the grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.*/

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks=sc.nextInt();
		
		if(marks<25) {
			System.out.println("You got F grade.");
		}
		else if((marks>=25) && (marks<45)) {
			System.out.println("You got E grade.");
		}
		else if((marks>=45) && (marks<50)) {
			System.out.println("You got D grade.");
		}
		else if((marks>=50) && (marks<60)) {
			System.out.println("You got C grade.");
		}
		else if((marks>=60) && (marks<80)) {
			System.out.println("You got B grade.");
		}
		else if((marks>=80) && (marks<=100)) {
			System.out.println("You got A grade.");
		}
		else {
			System.out.println("Not correct marks.");
		}
	}

}
