package step2;

public class HackerRankArrayLeftRotation {

	//https://www.hackerrank.com/challenges/array-left-rotation/problem
	// 재귀로 풀어보자
	
	public static int[] solutionRecur(int[] arr, int n) {
		
		if (n == 0) return arr;
	
		int temp = arr[0];

		for (int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = temp;
		return solutionRecur(arr, n-1);
	}
	
	public static int[] solutionImple(int[] a, int d) {
		
		for (int j=1; j<d; j++) {
			int temp = a[0];
			for (int i=0; i<a.length-1; i++) {
				a[i] = a[i+1];
			}
			a[a.length-1] = temp;
		}

		return a;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		solutionRecur(arr, 6);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println();
		
		for (int num : solutionImple(arr, 6)) {
			System.out.print(num + " ");
		}
	}
	
	// testCase 8, 9번이 극단적으로 큰 케이스 같은데, 런타임 에러가 나온 걸 봐서 재귀할 떄 시간 초과가 되는건가?
	// 일단 보류하고 한 번 더 도전해본다
	
	// 명령형으로 풀었을 때, 시간초과되지 않고 풀렸다! 만약 케이스 숫자가 제한되어 있지 않고,
	//	극단적인 케이스라면 재귀는 쓰지 않는 것이 좋을듯.
	
}
