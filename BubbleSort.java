package sortingalgorithmswithdrawing;

public class BubbleSort {

	public static void main(String[] args) {
		int[] testArray = DataSet.getData();
		
		System.out.println("Unsorted array");
		printArray(testArray);
		
		long startTime = System.nanoTime();
		int[] sortedArray = bubSort(testArray);
		long endTime = System.nanoTime();
		
		System.out.println("\nSorted array:");
		printArray(sortedArray);
		System.out.println("\nThat took " + (endTime - startTime) + " nanoseconds.");
	}
	
	public static void printArray(int[] arr) {
			
			String ans = "";
			
			for (int k = 0; k < arr.length; k++) {
				ans += arr[k] + " ";
			}
			
			System.out.println(ans);
	}
	
	public static void swap(int[] arr, int index) {
		int storage = arr[index];
		arr[index] = arr[index + 1];
		arr[index + 1] = storage;
		
	}
	
	public static int[] bubSort(int[] arr) {
		int len = arr.length;
		
		for (int j = 0; j < (len - 1); j++) {
			for (int i = 0; i < (len - j - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i);
				}
			}
		}
		
		return arr;
	}
}
