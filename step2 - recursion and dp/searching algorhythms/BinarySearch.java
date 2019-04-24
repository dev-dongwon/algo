package searching;

public class BinarySearch {

	public static int binarySearch(int[] arr, int start, int end, int target) {
		
		int middle = (start + end) / 2;
		
		if (end < start) {
			return -1;
		}
		
		if (target < arr[middle]) {
			return binarySearch(arr, start, middle-1, target);
		} else if (target > arr[middle]) {
			return binarySearch(arr, middle + 1, end, target);
		} else if (target == arr[middle]) {
			return middle;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] case1 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(case1, 0, case1.length-1, 10));
	}
	
}
