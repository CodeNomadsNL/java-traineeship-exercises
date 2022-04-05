package nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects;

import nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects.Purchase;

public class ReceiptSolution03 {

    Purchase[] purchases;

    /**
     * The constructor of Receipt takes in an array of Purchase objects, assigns it to the internal purchases field.
     *
     * @param purchases an array of Purchase objects to put on the Receipt
     */
    public ReceiptSolution03(Purchase[] purchases) {
        this.purchases = purchases;

        for (Purchase purchase: purchases) {
            if (purchase.price < 0.0) {
                throw new IllegalArgumentException("The purchase of " + purchase.product + " cannot have a negative price!");
            }
            if (purchase.quantity < 0) {
                throw new IllegalArgumentException("The purchase of " + purchase.product + " cannot have a negative quantity!");
            }
        }
    }

    public Purchase findProduct(String productName) {
        for (Purchase purchase: this.purchases) {
            if (productName.equals(purchase.product)) {
                return purchase;
            }
        }

        // Typically when we find nothing, we return nothing. In Java's case, nothing is the same as `null`.
        return null;
    }

    /**
     * The getTotalPrice method calculates the sum of the subTotals of all the Purchases and returns this value. It
     * will recalculate this value every time you call the method.
     * @return the sum of all subTotals for all Purchases
     */
    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Purchase purchase: this.purchases) {
            totalPrice = totalPrice + purchase.getSubTotal();
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[2];
        purchases[0] = new Purchase();
        purchases[0].product = "Large Eggs";
        purchases[0].quantity = -2;
        purchases[0].price = 0.99;

        purchases[1] = new Purchase();
        purchases[1].product = "Milk";
        purchases[1].quantity = 1;
        purchases[1].price = -1.15;

        ReceiptSolution03 receipt = new ReceiptSolution03(purchases);
    }
}
