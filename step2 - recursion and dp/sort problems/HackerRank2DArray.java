package step2;

public class HackerRank2DArray {
//	https://www.hackerrank.com/challenges/2d-array/problem
	
	public static int solution(int[][] arr) {
		
		int temp;
		int answer = arr[0][0]+ arr[0][1]+arr[0][2]
				+ arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
		
		for (int i=0; i<arr.length-2; i++) {
			for (int j=0; j<arr.length-2; j++) {
				temp = arr[i][j]+ arr[i][j+1]+arr[i][j+2]
					+ arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				if (answer < temp) answer = temp;
			}
		}
		
		return answer;
	}
}
