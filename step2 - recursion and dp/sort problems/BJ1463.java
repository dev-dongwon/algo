package step2;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class BJ1463 {

//	https://www.acmicpc.net/problem/1463
	
	/*	
	문제
	정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

	X가 3으로 나누어 떨어지면, 3으로 나눈다.
	X가 2로 나누어 떨어지면, 2로 나눈다.
	1을 뺀다.
	정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

	입력
	첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.

	출력
	첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
	
	힌트
	10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.

	 */

	// 아오!! 30분 안에 못풀었다. dp로 풀 생각 못하고, 계속 for문만 돌리다가 안나와서 정답을 서칭해봤다.
	
	// dp 점화식 세우는 게 관건이다. 알고 보니 생각보단 간단했다.
	
	// 일단 기본 전제는 이렇게 시작한다
	// dp[n] = n을 1로 만드는 최소한의 연산 수
	// d[n] = d[n-1] + 1, d[n] = d[n/3] + 1, d[n] = d[n/2] + 1 ,  이 셋 중 하나다
	// 세 개의 평가식 중 최소값을 찾으면 끝이다.
	
	// 이것을 그대로 코드로 옮겨보면
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int dp[] = new int[n + 1];

		dp[0] = dp[1]  = 0;

		for (int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + 1;
			
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			} 
			
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
		}
			System.out.println(dp[n]);
			scan.close();
	}

}
