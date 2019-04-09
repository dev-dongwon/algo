package dailyAlgo;

public class AlgorhythmsLargestElementsInArray {
	
	// 배열 중 가장 큰 3가지 수를 골라보자!
	// Arrays.sort 쓰지 말고 직접 해보자
	public static void solution(int[] arr) {
		
		if (arr.length < 3) {
			System.out.println("수행 불가");
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i=0; i<arr.length; i++) {
			int current = arr[i];

			if (first < current) {
				third = second;
				second = first;
				first = current;
			} else if (second < current) {
				third = second;
				second = current;
			} else if (third < current) {
				third = current;
			}
		}
		
		System.out.println(first + " ," + second + " ," + third);
	}

	
	public static void main(String[] args) {
		int[] case1 = {6, 8, 1, 9, 2, 1, 10};
		solution(case1);
	}
}
