package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class MultipleArraysSolution02 {

    public static void main(String[] args) {

        String[] products = new String[]{"Large Eggs", "Milk", "Cottage Cheese", "Natural Yoghurt"};
        int[] quantities = new int[]{2, 1, 1, 3};
        double[] prices = new double[]{0.99, 1.15, 0.59, 0.70};

        // Can you create a for-loop that identifies the product with the highest sub-total (quantity * price)? If so,
        // print the name of that product.

        // Here the answer is actually no. Keeping track of the index for other arrays while for-looping over another
        // is a way to create a really bad algorithm. It's such a bad idea that we're not even showing you a hacky way
        // to do it anyway.

        // Check the next two exercises for a way to "fix" this...
    }

}
