import sort.Sorting;


public class Main {

    public static void main(String[] args) {

        //Initialise an int array with random numbers
        int arraySize = 100;
        int[] randomArray = Sorting.getRandomArray(arraySize);
        Sorting.printArray(randomArray);


        //Sort the array with your sorting algorithm
        Sorting.bubbleSort(randomArray);

        //Print the array to the console
        Sorting.printArray(randomArray);

        //Do a runtime analysis of your algorithm
        randomArray = Sorting.getRandomArray(arraySize);
        System.out.println(Sorting.measureRuntimeBubblesort(randomArray));
        System.out.println(Sorting.measureRuntimeQuicksort(randomArray));

        //  For which array size does the execution time start to rise significantly?


        // TODO Compare the execution time of your algorithm with the execution time of your QuickSort or BubbleSort implementation


        // TODO Print the iterations counters on the console
    }
}
