package nl.yoink.courses.dev.java.arrays.and.loops.assignments.objects;

public class Purchase {
    public String product;
    public int quantity;
    public double price;

    public double getSubTotal() {
        return this.price * this.quantity;
    }
}
