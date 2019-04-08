package dailyAlgo;

import java.util.Arrays;

public class Programmers12932 {
	
//	자연수 뒤집어 배열로 만들기
//
//	문제 설명
//	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//	제한 조건
//	n은 10,000,000,000이하인 자연수입니다.
//	
//	입출력 예
//		n		return
//	  12345	  [5,4,3,2,1]
	
	public static int[] solution(long n) {
		
       	int count = 0;
		long temp = n;
		
		while (temp > 0) {
			temp /= 10;
			count++;
			System.out.println(count);
		}
      	
		int[] answer = new int[count];
		int index = 0;
		
		while(n > 0) {
			answer[index++] = (int) (n % 10);
			n = n / 10;
		}
		return answer;

  }

	public static void main(String[] args) {
		
		int case1 = 1000000000;
		System.out.println(Arrays.toString(solution(case1)));
	}

}
