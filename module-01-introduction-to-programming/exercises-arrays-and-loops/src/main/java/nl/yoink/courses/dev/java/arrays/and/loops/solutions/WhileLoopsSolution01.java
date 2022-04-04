package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class WhileLoopsSolution01 {

    public static void main(String[] args) {

        // Let's start with this one
        int number = 1000;

        // Create a while loop here to print all numbers from 1000 to 0
        while (number >= 0) {
            System.out.println(number);
            number = number - 1;
        }

    }

}
