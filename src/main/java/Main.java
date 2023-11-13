import sort.Sorting;


public class Main {

    public static void main(String[] args) {

        //Initialise an int array with random numbers
        int arraySize = 1000;
        int[] randomArray = Sorting.getRandomArray(arraySize);
        int begin = 0;
        int end = arraySize -1;

        Sorting.printArray(randomArray);


        //Sort the array with your sorting algorithm
       // Sorting.bubbleSort(randomArray);

        //Print the array to the console
        Sorting.printArray(randomArray);

        //Do a runtime analysis of your algorithm
        randomArray = Sorting.getRandomArray(arraySize);

        System.out.println(Sorting.measureRuntimeBubblesort(randomArray));
        System.out.println(Sorting.measureRuntimeQuicksort(randomArray, begin , end));

        //  For which array size does the execution time start to rise significantly?
        // From a number of 10.000 array size it start to rise significant.

        // TODO Compare the execution time of your algorithm with the execution time of your QuickSort or BubbleSort implementation


        // Print the iterations counters on the console
        // In order to count iteration bubbleCount turn off task 2
        System.out.println("Get Bubble Counts: " + Sorting.getBubbleCounts());
        System.out.println("Get Quick Counts: " + Sorting.getQuickCounts());
    }
}
