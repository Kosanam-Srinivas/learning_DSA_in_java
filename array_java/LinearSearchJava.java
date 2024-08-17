public class LinearSearchJava {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int target = 13;
        int result = linearSearchJava(arr, target);
        if (result != -1)
            System.out.println("Element found at index "+result);
        else
            System.out.println("Element not found in the Array");
    }

    private static int linearSearchJava(int[] arr, int target) {
        int step = 0;
        for (int i = 0; i < arr.length; i++) {
            step++;
            if(arr[i] == target){
                System.out.println("Steps taken by Linear Search: " + step);
                return i;
            }
        }
        return -1;
    }
}
