package step3;

import java.util.*;

public class Baekjoon1427 {

	public static long solution(long N) {

		long answer = 0;

		if (N < 10) {
			return N;
		}

		int count = 0;
		long tempNum = N;

		while (tempNum > 0) {
			tempNum = tempNum / 10;
			count++;
		}

		int[] tempArr = new int[count];
		int index = 0;

		while (N > 0) {
			tempArr[index] = (int) N % 10;
			N = N / 10;
			index++;
		}

		Arrays.sort(tempArr);

		int power = 1;

		for (int i = 0; i < tempArr.length; i++) {
			answer += tempArr[i] * power;
			power = power * 10;
		}

		return answer;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();

		System.out.println(solution(N));

	}

}
