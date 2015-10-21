
import java.util.Arrays;

class MergeSort {
	
	public static void main(String args[]) {
		int arr[] = {53, 34, 55, 27, 92, 82, 16, 23}; 

		System.out.println("The unsorted array is:");
		System.out.println(Arrays.toString(arr));

		mergesort(arr);

		System.out.println("The sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

	static void mergesort(int arr[]) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int left[] = new int[mid]; // 4 integer 
		int right[] = new int[n - mid]; // 4 integer 
		for (int i = 0; i < mid; i++) // 4 iteration
			left[i] = arr[i];
		for (int i = mid; i < n; i++) // 4 iteration 
			right[i - mid] = arr[i];
		mergesort(left);
		mergesort(right);
		merge(arr, left, right);
	}

	public static void merge(int arr[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[i];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}