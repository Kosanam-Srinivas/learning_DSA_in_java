package array_java;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,2,6,3,4,1,0};
        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        mergeSort(arr, 0, arr.length-1);
//        iterativeQuickSort(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low < high){
            int mid = (low+high)/2;
            mergeSort(arr,low, mid);
            mergeSort(arr, mid+1,high);

            merge(arr, low, mid, high);
        }

    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays L[] and R[]
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays

        // Initial indices of the two subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
