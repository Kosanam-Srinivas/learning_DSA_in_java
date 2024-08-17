package array_java;

public class ArrayDeleteOperations {
    public static void printArray(int[] array, int logicalSize) {
        for (int i = 0; i < logicalSize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int removeLastElement(int[] array, int logicalSize) {
        if (logicalSize > 0) {
            logicalSize--; // Decrease logical size by one
        } else {
            System.out.println("Array is already empty.");
        }
        return logicalSize;
    }

    public static int removeElementAtPosition(int[] array, int logicalSize, int position) {
        if (position < 0 || position >= logicalSize) {
            System.out.println("Invalid position.");
            return logicalSize;
        }

        // Shift elements to the left to fill the gap
        for (int i = position; i < logicalSize - 1; i++) {
            array[i] = array[i + 1];
        }
        logicalSize--; // Decrease logical size by one
        return logicalSize;
    }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int logicalSize = myArray.length;
        System.out.println("Array elements:");
        printArray(myArray, logicalSize);
        System.out.println("Length of array: " +logicalSize);

        // Remove last element
        System.out.println("Remove last element:");
        logicalSize = removeLastElement(myArray, logicalSize);
        printArray(myArray, logicalSize);  // Output: 10 20 30 40

        // Remove element at position 1 (second element)
        int pos = 1;
        System.out.println("Remove element at position" + pos);
        logicalSize = removeElementAtPosition(myArray, logicalSize, pos);
        printArray(myArray, logicalSize);  // Output: 10 30 40

        System.out.println("Length of array: " +logicalSize);
    }
}
