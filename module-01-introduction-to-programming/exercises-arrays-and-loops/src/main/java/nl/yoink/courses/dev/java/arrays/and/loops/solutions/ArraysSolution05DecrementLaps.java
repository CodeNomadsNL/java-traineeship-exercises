package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

import java.util.Arrays;

public class ArraysSolution05DecrementLaps {

    // Write the decrement lap function below before running this assignment
    public static void main(String[] args) {

        int[] lapTimes = new int[] {48, 49, 47, 46, 46, 49, 51, 55, 58};
        System.out.println("Original times: " + Arrays.toString(lapTimes));

        // Uncomment this line when you have implemented decrementLaps
        decrementLaps(lapTimes, 9);

        System.out.println("Updated times:  " + Arrays.toString(lapTimes));

    }

    // Write the decrementlap function here:
    public static void decrementLaps(int[] laps, int size) {
        int counter = 0;

        while (counter < size) {
            laps[counter] = laps[counter] - 1;
            counter = counter + 1;
        }
    }
}
