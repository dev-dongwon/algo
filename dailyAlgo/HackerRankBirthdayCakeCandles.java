package dailyAlgo;

import java.util.*;

public class HackerRankBirthdayCakeCandles {
	
//	You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. 
//	When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to find out how many candles she can successfully blow out.
//
//	For example, if your niece is turning  years old, and the cake will have  candles of height , , , , 
//	she will be able to blow out  candles successfully, since the tallest candles are of height  and there are  such candles.
//
//	Function Description
//
//	Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.
//
//	birthdayCakeCandles has the following parameter(s):
//
//	ar: an array of integers representing candle heights
//	Input Format
//
//	The first line contains a single integer, , denoting the number of candles on the cake. 
//	The second line contains  space-separated integers, where each integer  describes the height of candle .

// => 배열을 정렬해서 최대값을 가지는 수 (중복 포함)은 몇개인가?
	
    static int birthdayCakeCandles(int[] arr) {
    	
    	Arrays.sort(arr);
    	int count = 0;
    	
    	for (int i=arr.length-1; i>=0; i--) {
    		if (arr[arr.length-1] == arr[i]) {
    			count++;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
		int[] case1 = {3,2,1,3,3};
		int result = birthdayCakeCandles(case1);
		System.out.println(result);
	}


}
