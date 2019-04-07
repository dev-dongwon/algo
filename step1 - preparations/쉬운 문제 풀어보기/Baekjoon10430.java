package step1;

import java.util.Scanner;

public class Baekjoon10430 {
	
//	문제
//	(A+B)%C는 (A%C + B%C)%C 와 같을까?
//
//	(A×B)%C는 (A%C × B%C)%C 와 같을까?
//
//	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//
//	출력
//	첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
	
	public static int plusAndMod(int A, int B, int C) {
		return (A + B) % C;
	}
	
	public static int modAndPlus(int A, int B, int C) {
		return (A%C + B%C) % C;
	}

	public static int multiplyAndMod(int A, int B, int C) {
		return (A * B) % C;
	}
	
	public static int modAndMultiply(int A, int B, int C) {
		return (A%C * B%C) % C;
	}
	
	public static void testPrinter(int[] arr) {
		System.out.println(plusAndMod(arr[0], arr[1], arr[2]));
		System.out.println(modAndPlus(arr[0], arr[1], arr[2]));
		System.out.println(multiplyAndMod(arr[0], arr[1], arr[2]));
		System.out.println(modAndMultiply(arr[0], arr[1], arr[2]));
	}
	
	public static void answerPrinter(int A, int B, int C) {
		System.out.println(plusAndMod(A, B, C));
		System.out.println(modAndPlus(A, B, C));
		System.out.println(multiplyAndMod(A, B, C));
		System.out.println(modAndMultiply(A, B, C));
	}
	
	
	public static void main(String[] args) {
		
		int[] case1 = {4,5,2};
		int[] case2 = {134,134,35656};
		int[] case3 = {999343, 234234, 1232};
		int[] case4 = {-266,-23, -234};
		int[] case5 = {0, 0, 0};
		
		testPrinter(case1);
		testPrinter(case2);
		testPrinter(case3);
		testPrinter(case4);
		testPrinter(case5);

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C= scan.nextInt();
		
		answerPrinter(A, B, C);
	}
}
