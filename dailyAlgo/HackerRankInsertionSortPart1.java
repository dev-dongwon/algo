package dailyAlgo;

public class HackerRankInsertionSortPart1 {
	
	
	public static void insertionSort1(int n, int[] arr) {
		
		int temp = arr[n-1];
		
		for (int i=arr.length-2; i>=0; i--) {
			if (arr[i] > temp) {
				arr[i+1] = arr[i];
				
				for (int value : arr) {
					System.out.print(value + " ");
				}
			} else {
				arr[i-1] = temp;
				for (int value : arr) {
					System.out.print(value + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
//		int[] case1 = {2,4,6,8,3};
//		insertionSort1(5, case1);
		
		int[] case2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
		insertionSort1(10, case2);
	}

}
