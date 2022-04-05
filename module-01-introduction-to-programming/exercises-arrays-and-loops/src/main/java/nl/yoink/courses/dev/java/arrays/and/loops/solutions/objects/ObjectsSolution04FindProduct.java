package nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects;

import nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects.Purchase;

public class ObjectsSolution04FindProduct {

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

        // Uncomment these lines after implementing the findProduct function:
        Purchase foundPurchase = findProduct(purchases, "Milk");
        System.out.println("Product found: " + foundPurchase);

    }

    // Write the function findProduct here, which accepts an array of Purchases and the name of a product and then
    // returns the found product. What should you return when the product was not found in the array?
    public static Purchase findProduct(Purchase[] purchases, String productName) {
        for (Purchase purchase: purchases) {
            if (productName.equals(purchase.product)) {
                return purchase;
            }
        }

        // Typically when we find nothing, we return nothing. In Java's case, nothing is the same as `null`.
        return null;
    }

}
