/*
(Stopwatch) Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with getter methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100000);
        }

        StopWatch s = new StopWatch();
        SelectionSort.selectionSort(array);
        s.stop();

        System.out.println("Execution time: " + s.getElapsedTime() / 1000.0 + " seconds");
    }
}