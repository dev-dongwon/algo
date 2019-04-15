package dailyAlgo;

import java.util.ArrayList;
import java.util.List;

public class CodilityBinaryGap {
	
	
//	A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
//
//	For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
//	The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
//	The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
//	The number 32 has binary representation 100000 and has no binary gaps.
//
//	Write a function:
//
//	class Solution { public int solution(int N); }
//
//	that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//
//	For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
//	Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
//
//	Write an efficient algorithm for the following assumptions:
//
//	N is an integer within the range [1..2,147,483,647].
//	Copyright 2009–2019 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	
	public static int solution(int N) {
	        
			List<Integer> binary = new ArrayList<>();
			
			while (N > 0) {
				binary.add(N % 2);
				N /= 2;
			}
			
			// 2. cache = 그 전 숫자가 1인지 아닌지 저장, count = binary gap count, temp = binary gap 을 한 번 세릴때마다 저장, answer = binary gap 중 가장 큰 값 저장
			
			int cache = 0;
			int count = 0;
			int temp = 0;
			int answer = 0;
			
			
			for (int i=binary.size()-1; i>=0; i--) {
				
				if (binary.get(i) == 0 && cache == 1) {
					count++;
				}
				
				if (binary.get(i) == 1) {
					cache = 1;
					if (count > 0) {
					    temp = count;
						count = 0;
					    if (answer < temp) {
					        answer = temp;
					    }
					}
					
				}
			}
			
			return answer;
	    }

	public static void main(String[] args) {
		
		System.out.println(solution(1041));
		
	}
}
