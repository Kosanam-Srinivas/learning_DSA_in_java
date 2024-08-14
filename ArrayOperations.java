package arrays_java;
public class ArrayOperations {

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void ArrayTraversal(int[] numbers) {
        // Using a for loop to traverse the array
        int index = 0;
        while (index < numbers.length) {
            System.out.println("Element at index " + index  + ": " + (index + 1));
            index++;
        }
    }

//    public static void ArrayInsertionNewValue(int[] array,int noOfElements,newVlaue){
//        int[] newArray = new int[array.length+noOfElements];
//
//        for (int i : newArray){
//            newArray[i] = array[i];
//        }
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // static initialization
        String[] names = {"Alice", "Bob", "Charlie"};
        int [] intArray = new int[7]; // Dynamic initialization
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = 45;
        intArray[3] = 48;
        intArray[4] = 78;
        intArray[5] = -6;
        intArray[6] = -22;
        printArray(numbers);
        ArrayTraversal(numbers);
//        ArrayInsertionNewValue(numbers);
    }
}
