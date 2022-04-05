package nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects;

import nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects.Purchase;

public class ObjectsSolution01 {

    public static void main(String[] args) {
        // Create a variable called `purchases`, containing 4 `Purchase` objects, each representing a purchase from the
        // three arrays from the previous chapter. For reference, those arrays are provided again here:
        //
        String[] products = new String[]{"Large Eggs", "Milk", "Cottage Cheese", "Natural Yoghurt"};
        int[] quantities = new int[]{2, 1, 1, 3};
        double[] prices = new double[]{0.99, 1.15, 0.59, 0.70};

        Purchase[] purchases = new Purchase[4];

        int counter = 0;
        while (counter < 4) {
            purchases[counter] = new Purchase();
            purchases[counter].product = products[counter];
            purchases[counter].price = prices[counter];
            purchases[counter].quantity = quantities[counter];

            counter = counter + 1;
        }

        // When done, uncomment this line to print the array to the console:
        printPurchases(purchases);
    }

    public static void printPurchases(Purchase[] purchases) {
        for (Purchase purchase: purchases) {
            System.out.printf("%15s: %4d * %-7.2f\n", purchase.product, purchase.quantity, purchase.price);
        }
    }

}
