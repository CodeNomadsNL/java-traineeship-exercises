package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class FunctionsSolution01MinMax {

    // Implement the max and min functions below before running this assignment
    public static void main(String[] args) {

        double first = 4.3;
        double second = 14.1;

        System.out.println("Max of " + first + " and " + second + " is: " + max(first, second));
        System.out.println("Min of " + first + " and " + second + " is: " + min(first, second));

    }

    /**
     * Implement a function that returns the larger of the two parameter values.
     *
     * @param a the first number
     * @param b the second number
     * @return the largest of the two numbers
     */
    public static double max(double a, double b) {
        if (a < b) {
            return b;
        }
        // Note that here is no 'else' here. Since the 'if'-block contains a return, anything after the if is
        // logically part of the 'else'. If there was no return-statement, then whatever comes after the if-block will
        // happen if the condition is true or false either way.
        // So which one is better you ask? It's more a question of style and situation. Sometimes code is better when
        // expressed with an explicit 'else', sometimes it's more concise without it.

        return a;
    }

    /**
     * Implement a function that returns the smaller of the two parameter values.
     *
     * @param a the first number
     * @param b the second number
     * @return the smallest of the two numbers
     */
    public static double min(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

}
