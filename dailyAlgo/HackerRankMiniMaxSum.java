package dailyAlgo;

import java.util.Arrays;

public class HackerRankMiniMaxSum {
	
//	Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
//
//	For example, . Our minimum sum is  and our maximum sum is . We would print
//
//	16 24
//	Function Description
//
//	Complete the miniMaxSum function in the editor below. It should print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
//
//	miniMaxSum has the following parameter(s):
//
//	arr: an array of  integers
//	Input Format
//
//	A single line of five space-separated integers.
//
//	Constraints
//
//
//	Output Format
//
//	Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
//
//	Sample Input
//	1 2 3 4 5
	
//	Sample Output
//	10 14

	
//	Explanation
//
//	Our initial numbers are , , , , and . We can calculate the following sums using four of the five integers:
//
//	If we sum everything except , our sum is .
//	If we sum everything except , our sum is .
//	If we sum everything except , our sum is .
//	If we sum everything except , our sum is .
//	If we sum everything except , our sum is .
//	Hints: Beware of integer overflow! Use 64-bit Integer.
	
    static void miniMaxSum(int[] arr) {
    	
    	long sum = 0;
    	
    	for (int n : arr) {
    		sum += n;
    	}
    	
    	long[] sumArr = new long[arr.length];
    	
    	for (int i=0; i<sumArr.length; i++) {
    		sumArr[i] = sum - arr[i];
    	}
    	
    	Arrays.sort(sumArr);
    	System.out.println(sumArr[0] + " " + sumArr[sumArr.length-1]);
    	
    	// int 를 써서 연산이 되지 않았다. long으로 데이터 타입을 바꿔서 해결.
    	// 데이터 범위를 살펴본다음 적절한 데이터 타입을 선택하자.
    	
    }
    
    public static void main(String[] args) {
    	int[] case1 = {1256741038, 623958417, 467905213, 714532089, 938071625};
    	miniMaxSum(case1);
	}
	


}
