package sorting;

public class MergeSort {
	
   /* pesudo code
	
	mergesort(A[], start, end) {
		if (start < end) then {
			mid <- (start + end) / 2;
			mergesort(A, start, mid);	// 전반부 정렬
			mergesort(A, mid, end);		// 후반부 정렬
			merge(A, start, mid, end);  // 정렬 후 merge
		}
	}
	
	머지 소트는 공간에 배열이 하나 더 필요하다
	퀵 소트와 다른 점이니 꼭 숙지하도록 하자
	
	머릿 속에 그림을 그려가면서 코드를 구현하자
	헷갈리면 부경대 권오흠 교수님 강좌 한 번 더 보자
    */
	
	public static void mergeSort(int[] arr, int start, int end) {
		
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int leftIndicator = start;
		int rightIndicator = mid+1;
		int tempArrIndicator = start;
		int[] temp = new int[arr.length];
		
		while (leftIndicator <= mid && rightIndicator <=end) {
			
			if (arr[leftIndicator] <= arr[rightIndicator]) {
				temp[tempArrIndicator++] = arr[leftIndicator];
			} else {
				temp[tempArrIndicator++] = arr[rightIndicator++];
			}
		}
		
		while (leftIndicator <= mid) {
			temp[tempArrIndicator++] = arr[leftIndicator++];
		}
		
		while (rightIndicator <= end) {
			temp[tempArrIndicator++] = arr[rightIndicator++];
		}
		
		for (int i=0; i<=temp.length; i++) {
			arr[i] = temp[i];
		}
	}
}
