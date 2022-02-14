
public class P23 {
	
	int squareNum(int num) {
		return num*num;
	}
	
	int addNum(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		P23 obj= new P23();
		int square=obj.squareNum(20);
		int sum=obj.addNum(32, 48, 24);
		
		System.out.println("The square value is: " + square);
		
		System.out.println("The sum value is: " + sum);
		

	}

}
