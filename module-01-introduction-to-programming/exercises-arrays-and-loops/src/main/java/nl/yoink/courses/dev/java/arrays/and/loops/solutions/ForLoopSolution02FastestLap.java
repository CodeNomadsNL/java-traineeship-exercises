package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class ForLoopSolution02FastestLap {

    // Write the fastest lap function below before running this assignment
    public static void main(String[] args) {

        int[] lapTimes = new int[] {61, 59, 67, 72, 68, 69};
        int fastestTime = 0;

        // Uncomment this line when you have implemented findFastestLap
        fastestTime = findFastestLap(lapTimes);


        System.out.println("Fastest lap time was: " + fastestTime);

    }

    // Write the fastest lap function here, using for loop
    // NOTE: It turns out we don't need the number of laps in the array here! Since we are not using the size at all
    // while finding the fastest lap, this function can actually work on _any_ int[] without knowing how many items
    // are in there.
    public static int findFastestLap(int[] laps) {
        int fastestLapSoFar = laps[0];

        for (int lap: laps) {
            if (lap < fastestLapSoFar) {
                fastestLapSoFar = lap;
            }
        }

        return fastestLapSoFar;
    }

}
