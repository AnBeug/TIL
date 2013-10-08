public class QuickSorter {

    public int[] sort(int[] arr) {
        System.out.println("QuickSorter run:");

        if (arr.length <= 1) {
            return arr;
        }

        return quickSort(arr, 0, arr.length);
    }

// function quicksort(array)
//     if length(array) > 1
//         pivot := select random element of array
//         left := first index of array
//         right := last index of array
//         while left ≤ right
//             while array[left] < pivot
//                 left := left + 1
//             while array[right] > pivot
//                 right := right - 1
//             if left ≤ right
//                 swap array[left] with array[right]
//                 left := left + 1
//                 right := right - 1
//         quicksort(array from first index to right)
//         quicksort(array from left to last index)
    private int[] quickSort(int[] arr, int left, int right) {
        if (arr.length > 1) {
            int pivot = arr.length / 2;
        }

        return arr;
    }
}