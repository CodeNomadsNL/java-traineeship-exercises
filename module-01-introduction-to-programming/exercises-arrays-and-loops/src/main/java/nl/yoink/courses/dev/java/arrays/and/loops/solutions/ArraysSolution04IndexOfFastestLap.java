package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class ArraysSolution04IndexOfFastestLap {

    // Write the fastest lap function below before running this assignment
    public static void main(String[] args) {

        int[] lapTimes = new int[] {48, 49, 47, 46, 46, 49, 51, 55, 58};
        // We start the value of the fastestLapIndex at -1, because setting it to 0 would already set it to a valid
        // value. We would be unable to distinguish between "found at element 0" and "no, I didn't find it yet". Since
        // -1 is not a valid array index, this value is used a lot in this way.
        int fastestLapIndex = -1;

        // Uncomment this line when you have implemented findFastestLapIndex
        fastestLapIndex = findFastestLapIndex(lapTimes, 9);


        System.out.println("Fastest lap time was: " + fastestLapIndex);

    }

    // Write the fastest lap function here:
    public static int findFastestLapIndex(int[] laps, int size) {
        int fastestLapIndexSoFar = 0;
        int counter = 0;

        while (counter < size) {
            if (laps[counter] < laps[fastestLapIndexSoFar]) {
                fastestLapIndexSoFar = counter;
            }

            counter = counter + 1;
        }

        return fastestLapIndexSoFar;
    }

}
