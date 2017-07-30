package sortingalgorithmswithdrawing;

public class InsertionSort {
	
	// Evaluates in O( n^2 ) time
	
	public static void main(String args[]) {
		System.out.println("Unsorted array");
		int[] testArray = DataSet.getData();
		printArray(testArray);
		
		long startTime = System.nanoTime();
		int[] sortedArray = insSort(testArray);
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
	
	public static int[] insSort(int[] arr) {
		int len = arr.length;
		
		for (int i = 1; i < len; i++) {						// start at second element and keep going until at end
			
			int comparison = arr[i];
			int j = i - 1;
															// move greater numbers up one place in the list 
			for ( ; j >= 0 && arr[j] > comparison ; j--) { 
				arr[j + 1] = arr[j];
			}
			
			arr[j + 1] = comparison;
		}
		
		return arr;
	}
	
}