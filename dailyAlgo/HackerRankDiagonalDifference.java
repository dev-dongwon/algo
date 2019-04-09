package dailyAlgo;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Input Format

The first line contains a single integer, , the number of rows and columns in the matrix . 
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.
*/


public class HackerRankDiagonalDifference {

	public static int solution(int[][] arr) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum1 += arr[i][i];
		}
		
		int index = 0;
		for (int j=0; j<arr.length; j++) {
			index = (arr.length-1) - j;
			sum2 += arr[j][index];
		}
		
		int result = Math.abs(sum1 - sum2);
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		int[][] case1 = {{11,2,4}, {4,5,6}, {10, 8, -12}};
		solution(case1);
		
	}

}
