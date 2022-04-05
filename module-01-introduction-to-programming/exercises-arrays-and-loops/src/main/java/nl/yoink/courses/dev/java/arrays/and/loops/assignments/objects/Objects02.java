package nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects;

public class Objects02 {

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
        // Hint: instead of keeping track of the highestSubTotal like in other loops, keep track of the Purchase
        // that has the highest sub-total.

    }

}
