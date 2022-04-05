package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

import java.util.Arrays;

public class MultipleArraysSolution03 {

    public static void main(String[] args) {

        String[] products = new String[]{"Large Eggs", "Milk", "Cottage Cheese", "Natural Yoghurt"};
        int[] quantities = new int[]{2, 1, 1, 3};
        double[] prices = new double[]{0.99, 1.15, 0.59, 0.70};

        int[] indices = new int[4];
        // Using the appropriate loop, fill the array `indices` with the indices for `products`, `quantities` and
        // `prices`. The result should be equal to `{0, 1, 2, 3}`

        int counter = 0;
        while (counter < 4) {
            indices[counter] = counter;
            counter = counter + 1;
        }

        System.out.println(Arrays.toString(indices));

        // After you've properly filled the `indices` array, write a for-loop that identifies the product with the
        // highest sub-total (quantity * price). Print the name of that product

        int highestSubTotalIndex = 0;
        double highestSubTotal = 0.0;

        for (int index: indices) {
            if (quantities[index] * prices[index] > highestSubTotal) {
                highestSubTotalIndex = index;
            }
        }

        // A little gem of wisdom:
        // -----------------------
        // So why all this fuzz to create a for-loop to do what a while loop can also do? This is to help you see that
        // there are not necessarily things you can only do with one or cannot do with the other loop. In the real
        // world, choosing the correct loop is a choice to make each time you write a loop. And sometimes the choice
        // has already been made by you and you only need to add something to the loop.
        //
        // As a rule of thumb, you will most likely use a for-loop for any collection that has a fixed number of items
        // when you start looping; whereas a while loop is probably more suitable in situations where it is harder to
        // predict the exact number of loops you will take.

        System.out.println(products[highestSubTotalIndex]);
    }

}
