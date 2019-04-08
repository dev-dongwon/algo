package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSortImperative(int[] arr) {
		
		for (int nowIndex = 1; nowIndex < arr.length; nowIndex++) {
			int nowValue = arr[nowIndex];
			int beforeIndex = nowIndex - 1;
			
			while (beforeIndex >= 0 && arr[beforeIndex] > nowValue) {
				arr[beforeIndex + 1] = arr[beforeIndex];
				beforeIndex--;
			}
			arr[beforeIndex + 1] = nowValue;
		}
		
	}
	
	
	public static void insertionSortRecur(int[] arr, int i) {
		
		if (i <= 1) {
			return;
		}
		
		insertionSortRecur(arr, i-1);

		int key = arr[i-1];
		int j = i - 2;
		
		while (j >= 0 && arr[j] > key) {
			arr[j+1] = arr[i];
			j--;
		}
		arr[j + 1] = key;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {123123,131,123,123,123,123234,12656,234,131,456};
		insertionSortImperative(arr);
		System.out.println(Arrays.toString(arr));
	}

}
