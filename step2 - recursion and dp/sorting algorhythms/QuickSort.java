
package sorting;

public class QuickSort {
	
	public static void quickSort(int[] arr, int begin, int end) {
		
		if (begin < end) {
			// 기준이 되는 pivot을 설정하는 partition 메소드
			int pivot = partition(arr, begin, end);
			
			// 피봇을 기준으로 재귀정렬 (작은 수 --- pivot --- 큰 수)
			quickSort(arr, begin, pivot-1);
			quickSort(arr, pivot+1, end);
		}
	}
	
	public static int partition(int[] arr, int begin, int end) {
		int pivot = arr[end];	// 여기선 마지막 수를 피봇으로 둔다
		int smallNumIndex = (begin - 1);
		
		for (int i=begin; i<end; i++) {
			if (arr[i] <= pivot) {
				smallNumIndex++;
				int temp = arr[smallNumIndex];
				arr[smallNumIndex] = arr[i];
				arr[i] = temp;
			}
		}
		
		int temp = arr[smallNumIndex + 1];	// pivot이 들어갈 위치
		arr[smallNumIndex + 1] = arr[end];
		arr[end] = temp;
		
		return smallNumIndex + 1;
	}

}
