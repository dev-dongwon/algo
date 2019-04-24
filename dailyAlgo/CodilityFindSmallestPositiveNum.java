package dailyAlgo;

import java.util.Arrays;

public class CodilityFindSmallestPositiveNum {
	
//	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//	Given A = [1, 2, 3], the function should return 4.
//
//	Given A = [−1, −3], the function should return 1.
//
//	Write an efficient algorithm for the following assumptions:
//
//	N is an integer within the range [1..100,000];
//	each element of array A is an integer within the range [−1,000,000..1,000,000].

	public static int solution(int[] A) {
		
		int answer = 1;
		
		Arrays.sort(A);
		int maxNum = 1;
		
		if (A[A.length-1] > 0) {
			maxNum = A[A.length-1];
		}
		
		boolean[] location = new boolean[maxNum+1];
		
		location[0] = true;
		
		for (int index : A) {
			if (index >= 0) {
				location[index] = true;
			}
		}
		
		for (int i=0; i<location.length; i++) {
			answer = A[A.length-1] + 1;
			if (location[i] == false) {
				return answer = i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] case1 = {1, 3, 6, 4, 1, 2};
		System.out.println(solution(case1));
		int[] case2 = {1,2,3};
		System.out.println(solution(case2));
	}

}
