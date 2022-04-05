package nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects;

public class StringConstructorSolution {

    public static void main(String[] args) {
        String initial = "This String makes no sense if you reverse it!";

        char[] initialChars = initial.toCharArray();

        char[] reversedChars = new char[initialChars.length];
        int counter = 0;

        while (counter < initialChars.length) {
            reversedChars[counter] = initialChars[(initialChars.length - 1) - counter];

            counter = counter + 1;
        }

        String reversed = new String(reversedChars);
        System.out.println(initial);
        System.out.println(reversed);
    }

}
