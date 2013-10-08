public class SortRunner {
	public static void main(String[] args) {
        int[] unsortedArray = { 1, 4, 2, 7, 2, 6, 0, 3, 55};

        printArray(unsortedArray);

        MergeSorter mergeSorter = new MergeSorter();
        int[] mergeSortedArray = mergeSorter.sort(unsortedArray);

        QuickSorter quickSorter = new QuickSorter();
        int[] quickSortedArray = quickSorter.sort(unsortedArray);
	}

    private static void printArray(int[] arr) {
        System.out.print("\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}