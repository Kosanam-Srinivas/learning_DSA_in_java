package array_java;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,2,6,3,4,1,0};
        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        quickSort(arr, 0, arr.length-1);
//        iterativeQuickSort(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pi = partition(arr, low, high);
            
            quickSort(arr, low,pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    private static void iterativeQuickSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Create an array to hold the stack values
        int[] stack = new int[arr.length];

        // Initialize top of stack
        int top = -1;

        // Push initial low and high values to the stack
        stack[++top] = low;
        stack[++top] = high;

        // Keep popping from the stack while it's not empty
        while (top >= 0) {
            // Pop high and low
            high = stack[top--];
            low = stack[top--];

            // Set pivot element at its correct position in the sorted array
            int pivotIndex = partition(arr, low, high);

            // If there are elements on the left side of the pivot, push them to the stack
            if (pivotIndex - 1 > low) {
                stack[++top] = low;
                stack[++top] = pivotIndex - 1;
            }

            // If there are elements on the right side of the pivot, push them to the stack
            if (pivotIndex + 1 < high) {
                stack[++top] = pivotIndex + 1;
                stack[++top] = high;
            }
        }
    }
}
