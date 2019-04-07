package step0;

import java.util.Scanner;

public class Plus {
	
	public static int plus (int A, int B) {
		int result = A + B;
		return result;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A;
		int B;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		System.out.println(plus(A, B));
		
	}
	
}