package nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects;

import nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects.ReceiptSolution02;

public class Receipt02 {

    Purchase[] purchases;
    double totalPrice = 0.0;

    // Move the function `findProduct` here from the previous assignments and put it into de `Receipt` class to work
    // with the fields of the `Receipt` class.

    // Replace the property `totalPrice` with a method `getTotalPrice` that calculates the total price of the receipt
    // when requested

    // When done, you can uncomment the lines in the `main` function below to test your work
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

        Receipt02 receipt = new Receipt02();
        receipt.purchases = purchases;

        //System.out.println(receipt.findProduct("Milk"));
        //System.out.println(receipt.findProduct("Jalapenos"));
    }
}
