package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class FunctionsSolution03Factorial {

    // Implement the factorial function below before running this assignment
    public static void main(String[] args) {

        // When you've implemented factorial, feel free to play around with the input `number`. What happens when you
        // set `number` to some heigher values? Can you explain this?
        int number = 5;

        System.out.println("Looping   Factorial of " + number + " is: " + factorial(number));
        System.out.println("Recursive Factorial of " + number + " is: " + factorial(number));

    }

    /**
     * Implement a function that returns the factorial of the given number. The factorial is the product of all of the
     * numbers less than or equal to the input. I.e. the factorial(5) = 1 * 2 * 3 * 4 * 5
     *
     * Note: this is the solution using a loop. The other function `factorialRec` is equivalent, but uses a recursive
     * algorithm.
     *
     * @param number the number to computer the factorial of
     * @return the factorial of the input
     */
    public static int factorial(int number) {
        int product = 1;

        while (number > 1) {
            product = product * number;
            number = number - 1;
        }

        return product;
    }

    /**
     * Implement a function that returns the factorial of the given number. The factorial is the product of all of the
     * numbers less than or equal to the input. I.e. the factorial(5) = 1 * 2 * 3 * 4 * 5
     *
     * Note: this is the solution using a loop. The other function `factorialRec` is equivalent, but uses a recursive
     * algorithm. A recursive algorithm calls on itself to solve an ever smaller problem.
     *
     * @param number the number to computer the factorial of
     * @return the factorial of the input
     */
    public static int factorialRec(int number) {
        if (number <= 1) {
            return 1;
        } else {
            // This is where the recursion happens. We are calling factorialRec here with the number just one smaller
            // than the parameter value. This means we are multiplying the `number` by whatever the factorial is of
            // `number - 1`. The if-clause above makes sure the algorithm stops when it reaches 1.
            return number * factorialRec(number - 1);
        }
    }

}
