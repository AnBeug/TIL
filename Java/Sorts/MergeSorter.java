import java.util.Arrays;

public class MergeSorter {
	public int[] sort(int[] arr) {
        System.out.println("Merge Sort Run: ");

		if (arr.length <= 1) {
			return arr;
		}
		
		int[] arr1 = {1};
		int[] arr2 = {2};

		System.out.println("arr1: ");
		printArray(arr1);

		int[] result = merge(arr1, arr2);

		return result;
	}


	private int[] mergeSort(int[] arr) {
		// Split the array in to two parts
		if (arr.length <= 1) {
			return arr;
		}

		int lo = 0;
		int hi = arr.length;
		int mid = hi / 2;
		int[] right = mergeSort(Arrays.copyof(arr, lo, mid));
		int[] left = mergeSort(Arrays.copyof(arr, mid, hi));

		int[] merged = merge(right, left);

		return merged;
	}

	private int[] merge(int[] arr1, int arr2[]) {
		int[] merged = new int[arr1.length + arr2.length];

		

		return merged;
	}

    private static void printArray(int[] arr) {
        System.out.print("\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}