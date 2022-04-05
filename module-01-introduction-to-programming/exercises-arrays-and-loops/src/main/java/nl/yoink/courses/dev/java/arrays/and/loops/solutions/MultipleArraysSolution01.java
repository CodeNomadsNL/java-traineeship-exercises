package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class MultipleArraysSolution01 {

    public static void main(String[] args) {

        String[] products = new String[]{"Large Eggs", "Milk", "Cottage Cheese", "Natural Yoghurt"};
        int[] quantities = new int[]{2, 1, 1, 3};
        double[] prices = new double[]{0.99, 1.15, 0.59, 0.70};

        // Create a while loop that identifies the product with the highest sub-total (quantity * price). Print the
        // name of that product.

        int counter = 0;
        int highestSubTotalIndex = 0;
        double highestSubTotal = 0.0;

        while (counter < 4) {
            if (quantities[counter] * prices[counter] > highestSubTotal) {
                highestSubTotalIndex = counter;
            }

            counter = counter + 1;
        }

        System.out.println("Product with highest sub total is: " + products[highestSubTotalIndex]);

    }

}
