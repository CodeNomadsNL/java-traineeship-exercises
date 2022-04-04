package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class ArraysSolution02AverageLap {

    // Write the average lap function below before running this assignment
    public static void main(String[] args) {

        int[] lapTimes = new int[] {48, 49, 47, 46, 46, 49, 51, 55, 58};
        int averageTime = 0;

        averageTime = calculateAverageLap(lapTimes, 9);

        System.out.println("Average lap time was: " + averageTime);

    }

    // Write the average lap function here:
    public static int calculateAverageLap(int[] laps, int  numberOfLaps) {

        int total = 0;
        int index = 0;

        while (index < numberOfLaps) {
            total = total + laps[index];
            index = index + 1;
        }

        return total / numberOfLaps;

    }

}
