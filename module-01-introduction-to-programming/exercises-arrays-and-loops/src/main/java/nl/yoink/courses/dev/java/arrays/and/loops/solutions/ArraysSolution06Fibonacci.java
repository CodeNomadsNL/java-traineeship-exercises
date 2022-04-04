package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

import java.util.Arrays;

public class ArraysSolution06Fibonacci {

    // Write a while loop that fills the fibonacci array with the correct values
    public static void main(String[] args) {

        // Create an int array with 20 elements and set the first two to 1
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Create a while-loop to walk over the array and update the remaining cells with the sum of the two cells
        // before it.
        int counter = 2; // We start at the third element, because 1 and 2 are already set.

        while (counter < 20) {
            fibonacci[counter] = fibonacci[counter - 1] + fibonacci[counter - 2];
            counter = counter + 1;
        }


        System.out.println("The Fibonacci sequence is: " + Arrays.toString(fibonacci));

    }

}
