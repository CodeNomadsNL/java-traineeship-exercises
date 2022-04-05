package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class ForLoopSolution03IndexOfFastestLap {

    // Write the fastest lap function below before running this assignment
    public static void main(String[] args) {

        int[] lapTimes = new int[] {61, 59, 67, 72, 68, 69};
        // We start the value of the fastestLapIndex at -1, because setting it to 0 would already set it to a valid
        // value. We would be unable to distinguish between "found at element 0" and "no, I didn't find it yet". Since
        // -1 is not a valid array index, this value is used a lot in this way.
        int fastestLapIndex = -1;

        // Uncomment this line when you have implemented findFastestLapIndex
        fastestLapIndex = findFastestLapIndex(lapTimes);


        System.out.println("Fastest lap time was: " + fastestLapIndex);

    }

    // Write the fastest lap function here:
    public static int findFastestLapIndex(int[] laps) {
        int fastestLapIndexSoFar = 0;
        int counter = 0;

        /* The short answer to "Can we write a for-loop to find the index?" is no, because we do not have access to the
         * index of the `lap` that we are looking at right now. However, the slightly longer answer is actually
         * yes: we _can_ write a for-loop to find the index of the fastest lap.
         *
         * Do note however that this implementation is bit brittle. It depends on you keeping proper track of the
         * counter variable with respect to the current lap. If this loop were more complicated with if-else-ifs and
         * returns, we run the risk of introducing errors here.
         *
         * That is why this is generally seen as an anti-pattern, or a reason _not_ to use a for-loop here. You might
         * even say that we are sort of mixing a while-loop with a for-loop here. So this "solution" is here to show
         * you that even though you _can_ solve it this way, it's probably better if you don't.
         */
        for (int lap: laps) {
            if (lap < laps[fastestLapIndexSoFar]) {
                fastestLapIndexSoFar = counter;
            }

            counter = counter + 1;
        }

        return fastestLapIndexSoFar;
    }

}
