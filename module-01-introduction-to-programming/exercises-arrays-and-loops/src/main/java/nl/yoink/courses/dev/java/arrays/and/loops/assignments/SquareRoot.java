package nl.yoink.courses.dev.java.arrays.and.loops.assignments;

public class SquareRoot {

    public static void main(String[] args) {

        double input = 36;

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
            bestGuess = (guessTooLow + guessTooHigh) / 2;

            // Check if we are done now:
            foundSquareRoot = bestGuess * bestGuess == input;
        }
        System.out.println("Found: " + bestGuess);


    }

}
