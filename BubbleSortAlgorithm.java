public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,2,6,3,4,1,0};

        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
//        bubbleSortUseTemp(arr);
//        bubbleSortUsingArithmeticOperations(arr);
        bubbleSortUsingBitWiseOperations(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void bubbleSortUseTemp(int[] arr) {
        int temp;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Set flag to true indicating a swap occurred
                }
            }
            System.out.println();
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void bubbleSortUsingArithmeticOperations(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    swapped = true;  // Set flag to true indicating a swap occurred
                }
            }
            System.out.println();
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void bubbleSortUsingBitWiseOperations(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    swapped = true;  // Set flag to true indicating a swap occurred
                }
            }
            System.out.println();
            for(int ele : arr){
                System.out.print(ele + " ");
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }
}
