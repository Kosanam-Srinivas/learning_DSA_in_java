package array_java;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {9,8,5,7,2,6,3,4,1,0};
//        int arr[] = {6,5,2,8,9,4};
        System.out.println("Before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        SelectionSortUseTemp(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void SelectionSortUseTemp(int[] arr) {
        int temp;
        int minIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j] ) {
                   minIndex = j;
                }
            }
            // Swap the elements
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println();
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
        }
    }
}
