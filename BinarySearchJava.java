public class BinarySearchJava {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15};
        int target = 13;
        int result = binarySearchJava(arr, target);
        int resultRec = recursionBinarySearchJava(arr, target, 0, arr.length);
        if (resultRec != -1)
            System.out.println("Element found at index "+resultRec);
        else
            System.out.println("Element not found in the Array");
        if (result != -1)
            System.out.println("Element found at index "+result);
        else
            System.out.println("Element not found in the Array");
    }

    public static int binarySearchJava(int[] arr, int target) {
        int step = 0;
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            step++;
            int mid = (left+right)/2;
            if (arr[mid] == target){
                System.out.println("Steps taken by Binary Search: " + step);
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary Search: " + step);
        return -1;
    }

    public static int recursionBinarySearchJava(int[] arr, int target, int left, int right) {
        if(left <= right){
            int mid = (left+right)/2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                return recursionBinarySearchJava(arr, target, mid+1, right);
            }
            else{
                return recursionBinarySearchJava(arr, target, left, mid-1);
            }
        }
        return -1;
    }

}
