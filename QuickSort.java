package sortingalgorithmswithdrawing;
import java.util.ArrayList;

public class QuickSort {
	
	public static void main(String[] args) {
		System.out.println("Unsorted array");
		ArrayList<Integer> testArray = DataSet.getArrayListData();
		printArray(testArray);
		
		int end = testArray.size() - 1;
		
		long startTime = System.nanoTime();
		ArrayList<Integer> sortedArray = QuickSort.qSort(testArray, 0,  end);
		long endTime = System.nanoTime();
		
		System.out.println("\nSorted array:");
		printArray(sortedArray);
		System.out.println("\nThat took " + (endTime - startTime) + " nanoseconds.");

	}
	
	public static ArrayList<Integer> qSort(ArrayList<Integer> arr, int low, int high) {
		if (low < high) {
			int piv = partition(arr, low, high);
			
			// recursion on the two unsorted parts
			qSort(arr, low, piv - 1);
			qSort(arr, piv + 1, high);
		}
		
		return arr;
	}
	
	public static int partition(ArrayList<Integer> arr, int low, int high) {
		int i = low - 1;
		int pivot = arr.get(high);
		
		for (int j = low; j <= high - 1; j++) {
			if (arr.get(j) <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		// move pivot to (i + 1), everything above goes up one index
		swap(arr, i + 1, high);
		
		return i + 1;
		
	}
	
	public static void printArray(ArrayList<Integer> arr) {
		String ans = "";
		
		for (int k = 0; k < arr.size(); k++) {
			ans += arr.get(k) + " ";
		}
		
		System.out.println(ans);
	}
	
	public static void swap(ArrayList<Integer> arr, int a, int b) {
		Integer tmp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, tmp);
	}
}
