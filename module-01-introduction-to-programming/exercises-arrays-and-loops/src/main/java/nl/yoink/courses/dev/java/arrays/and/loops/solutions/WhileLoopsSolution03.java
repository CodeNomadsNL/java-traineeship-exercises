package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class WhileLoopsSolution03 {

    public static void main(String[] args) {

        // Write a loop that calculates the sum of the first 20 numbers (i.e. 1+2+3+4+...+19+20) and prints te result

        // First we need two variables, one to count the numbers and the other to sum the numbers
        int counter = 1;
        int sum = 0;

        // Now we loop until we reach the number 20, each time adding the number in `counter` to the `sum`
        while (counter <= 20) {
            sum = sum + counter;
            counter = counter +1;
        }

        // Let's print the result
        System.out.println(sum);

    }

}
