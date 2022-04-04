package nl.yoink.courses.dev.java.decisions.samples;

/**
 * Simple demo application that flips a coin.
 */
public class CoinFlip {
    public static void main(final String[] args){
        System.out.println("Flipping coin...");
        final boolean randomBoolean = Math.random() > 0.5;   // 50% chance for `true`

        if(randomBoolean) {
            System.out.println("Result: Heads");
        }
        else {
            System.out.println("Result: Tails");
        }

        System.out.println("Goodbye!");
    }
}
