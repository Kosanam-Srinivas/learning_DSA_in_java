package array_java;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,2,6,3,4,1,0};
//        int arr[] = {6,5,2,8,9,4};
        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0...i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println();
            for(int element : arr){
                System.out.print(element + " ");
            }
        }
    }
}
