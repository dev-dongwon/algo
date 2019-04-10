package step2;

public class HackerRankArrayLeftRotation {

	//https://www.hackerrank.com/challenges/array-left-rotation/problem
	// 재귀로 풀어보자
	
	public static int[] solution(int[] arr, int n) {
		
		if (n == 0) return arr;
	
		int temp = arr[0];

		for (int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = temp;
		return solution(arr, n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		solution(arr, 6);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	// testCase 8, 9번이 극단적으로 큰 케이스 같은데, 런타임 에러가 나온 걸 봐서 재귀할 떄 시간 초과가 되는건가?
	// 일단 보류하고 한 번 더 도전해본다
	
}
