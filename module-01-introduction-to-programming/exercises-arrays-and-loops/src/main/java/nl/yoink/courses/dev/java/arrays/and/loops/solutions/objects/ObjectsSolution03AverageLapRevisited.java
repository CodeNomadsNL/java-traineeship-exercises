package nl.yoink.courses.dev.java.arrays.and.loops.solutions.objects;

public class ObjectsSolution03AverageLapRevisited {

    // Write the average lap function below before running this assignment
    public static void main(String[] args) {

        int[] lapTimes = new int[] {48, 49, 47, 46, 46, 49, 51, 55, 58};
        int averageTime = 0;

        averageTime = calculateAverageLap(lapTimes);

        System.out.println("Average lap time was: " + averageTime);

    }

    // Write the average lap function here:
    public static int calculateAverageLap(int[] laps) {
        int total = 0;
        int index = 0;

        // Now we actually don't need the second argument to the function anymore. Getting rid of the `numberOfLaps`
        // argument allows us to use this function on _any_ array filled with int-values.
        while (index < laps.length) {
            total = total + laps[index];
            index = index + 1;
        }

        return total / laps.length;
    }

}
