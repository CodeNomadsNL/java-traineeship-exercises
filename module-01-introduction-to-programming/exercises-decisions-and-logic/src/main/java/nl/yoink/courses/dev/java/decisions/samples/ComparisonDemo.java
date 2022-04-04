package nl.yoink.courses.dev.java.decisions.samples;


// Prevent the IDE from showing a warning as some expressions in this demo can be simplified.
@SuppressWarnings("PointlessBooleanExpression")
public class ComparisonDemo {
    public static void main(final String[] args) {

        System.out.println("Booleans can only be compared for (in-)equality with each other and not with any other type");
        System.out.println("true == false: " + (true == false)); // false
        System.out.println("true != false: " + (true != false)); // true
        // COMPILER ERROR: boolean values cannot be compared with "<", "<=", "=>" or ">".
        // System.out.println("true > false: " + (true > false));
        // COMPILER ERROR: boolean values cannot be compared for equality with other types
        //System.out.println("true != 1: " + (true = 1));
        System.out.println();

        // Values for all "integral types"
        final byte  oneAsByte  = 1;
        final short oneAsShort = 1;
        final int   oneAsInt   = 1;
        final long  oneAsLong  = 1;
        final char  oneAsChar  = 1; // Note: This is the ASCII control code "SOH", not the character "1".

        System.out.println("All integral types can be compared to each other. They are compared as signed integers.");
        System.out.println("1 (byte)  = 1 (short): " + (oneAsByte  == oneAsShort)); // true
        System.out.println("1 (short) = 1 (int):   " + (oneAsShort == oneAsInt));   // true
        System.out.println("1 (int)   = 1 (long):  " + (oneAsInt   == oneAsLong));  // true
        System.out.println("1 (long)  = 1 (char):  " + (oneAsLong  == oneAsChar));  // true
        System.out.println();

        // Values for all "floating-point types"
        final float oneAsFloat = 1.0f;
        final double oneAsDouble = 1.0;

        System.out.println("All floating-point types can be compared to each other. They are compared as floating-point values.");
        System.out.println("1 (float)  = 1 (double): " + (oneAsFloat  == oneAsDouble)); // true
        System.out.println();

        System.out.println("Integral types can be compared to floating-point types. Both sides are treated as floating-point values.");
        System.out.println("1 (int)  = 1 (float): " + (oneAsInt  == oneAsFloat)); // true
        System.out.println();

        // Some interesting float values and their bit patterns (1 bit sign, 8 bit exponent, 23 bit fraction):
        final float positiveZero = 0.0f;                        // 0 00000000 00000000000000000000000
        final float negativeZero = -0.0f;                       // 1 00000000 00000000000000000000000
        final float positiveInfinity = Float.POSITIVE_INFINITY; // 0 11111111 00000000000000000000000
        final float negativeInfinity = Float.NEGATIVE_INFINITY; // 1 11111111 00000000000000000000000
        final float notANumber = Float.NaN;                     // 0 11111111 10000000000000000000000

        System.out.println("\"Not a Number\"  is not less, equal, or greater than anything (including itself)");
        System.out.println("NaN  <   1: " + (notANumber  < 1.0));        //false
        System.out.println("NaN  =   1: " + (notANumber == 1.0));        //false
        System.out.println("NaN  >   1: " + (notANumber  > 1.0));        //false
        System.out.println("NaN  = NaN: " + (notANumber == notANumber)); //false
        System.out.println("NaN != NaN: " + (notANumber != notANumber)); //true
        System.out.println("NaN !=   1: " + (notANumber != 1));          //true
        System.out.println();

        System.out.println("Positive zero and negative zero are considered equal, even though they have different bit patterns.");
        System.out.println("-0.0 < 0.0: " + (negativeZero <  positiveZero)); // false
        System.out.println("-0.0 = 0.0: " + (negativeZero == positiveZero)); // true
        System.out.println("-0.0 > 0.0: " + (negativeZero >  positiveZero)); // false
        System.out.println();

        System.out.println("Number are sorted by their natural order");
        System.out.println("-1.0 < 0.0: " + (-1.0 <  0.0)); // true
        System.out.println(" 0.0 < 1.0: " + ( 0.0 <  1.0)); // true
        System.out.println();

        System.out.println("Negative infinity is smaller than any number");
        System.out.println("Positive infinity is larger than any number");
        System.out.println("-∞ < 0: " + (negativeInfinity < 0.0)); // true
        System.out.println(" 0 < ∞: " + (0.0 < positiveInfinity)); // true
    }
}
