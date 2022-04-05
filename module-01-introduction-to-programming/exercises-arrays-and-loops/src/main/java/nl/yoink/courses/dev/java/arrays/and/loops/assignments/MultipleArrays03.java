package nl.yoink.courses.dev.java.arrays.and.loops.assignments;

import java.util.Arrays;

public class MultipleArrays03 {

    public static void main(String[] args) {

        String[] products = new String[]{"Large Eggs", "Milk", "Cottage Cheese", "Natural Yoghurt"};
        int[] quantities = new int[]{2, 1, 1, 3};
        double[] prices = new double[]{0.99, 1.15, 0.59, 0.70};

        int[] indices = new int[4];
        // Using the appropriate loop, fill the array `indices` with the indices for `products`, `quantities` and
        // `prices`. The result should be equal to `{0, 1, 2, 3}`

        System.out.println(Arrays.toString(indices));

        // After you've properly filled the `indices` array, write a for-loop that identifies the product with the
        // highest sub-total (quantity * price). Print the name of that product

    }

}
