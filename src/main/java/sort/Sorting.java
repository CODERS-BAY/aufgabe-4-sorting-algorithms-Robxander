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
public static void sortArray(int[] array){
    System.out.println("Hier ist das zu sortierende Array: ");
    printArray(array);

}

    // TODO Implement a printArray method
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    // TODO Write a method to do a runtime analysis of your algorithm.
    public static long measureRuntime (int[] array){
        long timeStart = nanoTime();
         sortArray(array);
        long timeEnd = nanoTime();
        long difTime = (timeEnd -timeStart);
        return reSize(difTime);
    }
public static long reSize(long difTime){
        if(difTime > 1000000){
            System.out.println("Millisekunden: ");
        return difTime/1000000;
        } else if (difTime > 1000){
            System.out.println("Mikrosekunden: ");
            return difTime /1000;
        } else {
            System.out.println("Nanosekunden: ");
            return difTime;
        }
}


    //  For which array size does the execution time start to rise significantly?


    // TODO Add global static counter variables to count the number of iterations for each algorithm


    // TODO Compare the execution time of your algorithm with the execution time of your QuickSort or BubbleSort implementation


}
