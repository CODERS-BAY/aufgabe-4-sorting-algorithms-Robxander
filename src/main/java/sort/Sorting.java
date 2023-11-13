package sort;

import static java.lang.System.nanoTime;

public class Sorting {
    private static int bubbleCounter;
    private static int quickCounter;

    // Write a method to generate an array of size N initialised with random numbers

    public static  int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
        }
        return array;
    }

    // Implement a sorting algorithm of your choice
    // I tried to make HeapSort, but it's too complicated, thus I use bubbleSort

// public static void sortArray(int[] array){
//    System.out.println("Hier ist das zu sortierende Array: ");
//    printArray(array);
//}

    public static void bubbleSort(int[] array) {
        bubbleCounter = 0;
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
            bubbleCounter++;
//            System.out.println();
            if (isSorted) {
                return;
            }
        }
    }


    public static int getBubbleCounts(){
        return bubbleCounter;
    }


    public static void quickSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            quickCounter++;
            int partitionIndex = partition(numbers, begin, end);
            quickSort(numbers, begin, partitionIndex - 1);
            quickSort(numbers, partitionIndex + 1, end);
        }
    }
    private static int partition(int[] numbers, int begin, int end) {
        int pivot = numbers[end]; int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (numbers[j] <= pivot) {
                i++;
                int swapTemp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = swapTemp;
            }
        }

        int swapTemp = numbers[i + 1];
        numbers[i + 1] = numbers[end];
        numbers[end] = swapTemp;
        return i + 1;
    }

    public static int getQuickCounts (){
        return quickCounter;
    }
    public static int setQuickCounterZero(){
        return quickCounter = 0;
    }


    // Implement a printArray method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    // Write a method to do a runtime analysis of your algorithm.
    public static long measureRuntimeBubblesort(int[] array) {
        long timeStart = nanoTime();
        bubbleSort(array);
        long timeEnd = nanoTime();

        long difTime = (timeEnd - timeStart);
        return reSize(difTime);
    }


    public static long measureRuntimeQuicksort(int[] array, int begin, int end) {
        long timeStart = nanoTime();
        quickSort(array, begin, end);
        long timeEnd = nanoTime();

        long difTime = (timeEnd - timeStart);
        return reSize(difTime);
    }

    // Make to Millisecond, Mikrosecond and Nanosecond
    public static long reSize(long difTime) {
        if (difTime > 1e6) {
            System.out.print("Millisekunden: ");
            return (long) (difTime / 1e6);
//        } else if (difTime > 1000){
//            System.out.print("Mikrosekunden: ");
//            return difTime /1000;
        } else {
            System.out.print("Nanosekunden: ");
            return difTime;
        }
    }


    //  For which array size does the execution time start to rise significantly?
    // It start rising with BubbleSort at a arraysize of 100.000, because complexity is n^2

    // TODO Add global static counter variables to count the number of iterations for each algorithm


    // TODO Compare the execution time of your algorithm with the execution time of your QuickSort or BubbleSort implementation


}
