package nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects;

public class Receipt03 {

    Purchase[] purchases;

    // Write a constructor that accepts an array of Purchase objects and stores it in the `purchases` field.
    // Then add a check to the constructor to see if any Purchase object has a negative quantity or price
    // When done, you can uncomment the lines in the `main` function below to test your work

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

        // Uncomment these lines to test your work:
        //Receipt03 receipt = new Receipt03(purchases);
    }
}
