package array_java;

public class ArrayInsertOperations {

    public static void printArray(Object array) {
        if (array instanceof int[]) {
            for (int element : (int[]) array) {
                System.out.print(element + " ");
            }
        } else if (array instanceof String[]) {
            for (String element : (String[]) array) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Unsupported array type.");
        }
        System.out.println();
    }
    public static void arrayTraversal(Object array) {
        int index = 0;

        if (array instanceof int[]) {
            int[] numbers = (int[]) array;
            System.out.println("Traversing the numbers array:");
            while (index < numbers.length) {
                System.out.println("Element at index " + index + ": " + numbers[index]);
                index++;
            }
        } else if (array instanceof String[]) {
            String[] strings = (String[]) array;
            System.out.println("Traversing the string array:");
            while (index < strings.length) {
                System.out.println("Element at index " + index + ": " + strings[index]);
                index++;
            }
        } else {
            System.out.println("Unsupported array type.");
        }
    }
    public static void ArrayInsertionNewValue(int[] array, int val){
        int[] newArray = new int[array.length+1];
//        System.arraycopy(array, 0, newArray, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[5] = val;
        printArray(newArray);
    }
    public static void insertAtStart(String[] arr, String val){
        System.out.println("Before adding new value at a starting position");
        printArray(arr);

        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = val;
        System.out.println("After adding new value at a starting position");
        printArray(arr);
    }
    public static void insrtAtAnyPosition(int[] arr, int position, int val){
        System.out.println("Before adding new value at a "+position+" position");
        printArray(arr);

        for (int i = arr.length-1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = val;
        System.out.println("After adding new value at a "+position+" position");
        printArray(arr);
    }


    public static void main(String[] args) {
        int [] intArray = new int[7]; // Dynamic initialization
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = 45;
        intArray[3] = 48;
        intArray[4] = 78;
        intArray[5] = -6;
        intArray[6] = -22;
        int[] numbers = {1, 2, 3, 4, 5}; // static initialization
        String[] names = {"Alice", "Bob", "Charlie"};
        printArray(intArray);
        printArray(names);
        arrayTraversal(numbers);
        arrayTraversal(names);
        ArrayInsertionNewValue(numbers, 6);
        insertAtStart(names, "Hello");
        insertAtStart(names, "Hello");
        insrtAtAnyPosition(intArray, 3, 55);
    }
}
