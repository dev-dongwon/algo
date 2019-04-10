package step2;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1427 {

	/*
	문제
	배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

	입력
	첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

	출력
	첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
	
	예제 입력
	2143
	
	예제 출력
	4321
	*/
	
	public static long solution(long N) {
		
		long answer = 0;
		
		if (N < 10) {
			return N;
		}

		int count = 0;
		long tempNum = N;
		
		while(tempNum > 0) {
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
		
		for (int i=0; i<tempArr.length; i++) {
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
