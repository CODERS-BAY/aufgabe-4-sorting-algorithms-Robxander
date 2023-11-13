package sort;

import static java.lang.System.nanoTime;

public class Sorting {

    // TODO Write a method to generate an array of size N initialised with random numbers

    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
        }
        return array;
    }

    // TODO Implement a sorting algorithm of your choice
//public static void sortArray(int[] array){
//    System.out.println("Hier ist das zu sortierende Array: ");
//    printArray(array);
//}

    public static void bubbleSort(int[] array) {
        // TODO Implement algorithm
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    int b = array[j + 1];
                    array[j] = b;
                    array[j + 1] = a;
                    isSorted = false;
                }
//                printArray(array);
            }
//            System.out.println();
            if (isSorted) {
                return;
            }
        }
    }

    public static void quickSort(int[] array) {
        int pivot = array[array.length - 1];
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < array.length; i++) {
            countL = i;
            if (array[i] > pivot) {
                break;
            }
        }
        for (int i = array.length-2; i > -1; i--) {
            countR = i;
            if (array[i] < pivot) {
                break;
            }
        }
    }

    // TODO Implement a printArray method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    // TODO Write a method to do a runtime analysis of your algorithm.
    public static long measureRuntimeBubblesort (int[] array){
        long timeStart = nanoTime();
         bubbleSort(array);
        long timeEnd = nanoTime();

        long difTime = (timeEnd -timeStart);
        return reSize(difTime);
    }

    public static long measureRuntimeQuicksort (int[] array){
        long timeStart = nanoTime();
        quickSort(array);
        long timeEnd = nanoTime();

        long difTime = (timeEnd -timeStart);
        return reSize(difTime);
    }




public static long reSize(long difTime){
        if(difTime > 1e6){
            System.out.print("Millisekunden: ");
        return (long)(difTime/1e6);
//        } else if (difTime > 1000){
//            System.out.print("Mikrosekunden: ");
//            return difTime /1000;
        } else {
            System.out.print("Nanosekunden: ");
            return difTime;
        }
}


    //  For which array size does the execution time start to rise significantly?


    // TODO Add global static counter variables to count the number of iterations for each algorithm


    // TODO Compare the execution time of your algorithm with the execution time of your QuickSort or BubbleSort implementation


}
