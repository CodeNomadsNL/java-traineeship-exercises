package nl.yoink.courses.dev.java.arrays.and.loops.samples;

/**
 * This is a sample equivalent to the SquareRoot assignment. The only difference is that the algorithm was moved to its
 * own function and the helper function midPoint was introduced, like it was demonstrated in the slides.
 *
 * This file gives you a complete picture of what that would look like.
 */
public class SquareRootWithFunctions {

    public static void main(String[] args) {

        double input = 36;

        double root = guessSquareRoot(input);

        System.out.println("Found: " + root);

    }

    /**
     * Guesses the square root of the provided number. It will iteratively determine an ever more precise guess for the
     * square root of the number.
     *
     * @param input the number to determine the square root of
     * @return the best guess this algorithm can come up with
     */
    private static double guessSquareRoot(double input) {
        // The square root of any number is always bigger than zero:
        double guessTooLow = 0;

        // The quare root of any number is always smaller than that number itself:
        double guessTooHigh = input;

        // Our best guess is right in the middle of those two:
        double bestGuess = (guessTooLow + guessTooHigh) / 2;

        // Check if we are done:
        boolean foundSquareRoot = bestGuess * bestGuess == input;

        while (!foundSquareRoot) {

            // Print our best guess:
            System.out.println("Best guess: " + bestGuess);

            if (bestGuess * bestGuess < input) {
                guessTooLow = bestGuess;
            }

            if (bestGuess * bestGuess > input) {
                guessTooHigh = bestGuess;
            }

            // Improve our guess:
            bestGuess = midPoint(guessTooLow, guessTooHigh);

            // Check if we are done now:
            foundSquareRoot = bestGuess * bestGuess == input;
        }

        return bestGuess;
    }

    /**
     * Determines the midpoint between two numbers.
     *
     * @param x the first number
     * @param y the second number
     * @return the point in the middle between the first and second number
     */
    private static double midPoint(double x, double y) {
        return (x + y) / 2;
    }

}
