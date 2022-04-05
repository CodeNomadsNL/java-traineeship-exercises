package nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects;

import nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects.Purchase;

public class ObjectsSolution02 {

    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[4];
        purchases[0] = new Purchase();
        purchases[0].product = "Large Eggs";
        purchases[0].quantity = 2;
        purchases[0].price = 0.99;

        purchases[1] = new Purchase();
        purchases[1].product = "Milk";
        purchases[1].quantity = 1;
        purchases[1].price = 1.15;

        purchases[2] = new Purchase();
        purchases[2].product = "Cottage Cheese";
        purchases[2].quantity = 1;
        purchases[2].price = 0.59;

        purchases[3] = new Purchase();
        purchases[3].product = "Natural Yoghurt";
        purchases[3].quantity = 3;
        purchases[3].price = 0.70;

        // Write a for-loop to identify the purchase with the highest sub-total (quantity * price)
        Purchase highestSubTotalPurchase = purchases[0];

        for (Purchase purchase: purchases) {
            if (purchase.price * purchase.quantity > highestSubTotalPurchase.price * highestSubTotalPurchase.quantity) {
                highestSubTotalPurchase = purchase;
            }
        }

        System.out.println("The product with the highest sub total is: " + highestSubTotalPurchase.product);
    }

}
