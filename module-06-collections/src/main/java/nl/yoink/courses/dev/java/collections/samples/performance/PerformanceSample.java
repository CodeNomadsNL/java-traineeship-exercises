package nl.yoink.courses.dev.java.collections.samples.performance;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceSample {

    /**
     * Run this sample and see if you can explain the results.
     */
    public static void main(String[] args) {

        final ArrayList<Integer> arrayList = new ArrayList<>();
        final LinkedList<Integer> linkedList = new LinkedList<>();

        // Measure insertion between two list types
        timeAndReport("ArrayList", "Insert 10.000.000 elements", () -> fillListWithItems(arrayList));
        timeAndReport("LinkedList", "Insert 10.000.000 elements", () -> fillListWithItems(linkedList));

        // Measure accessing the first element between two list types
        timeAndReport("ArrayList", "Access element 0", () -> accessElementXManyTimes(arrayList, 0, 100_000));
        timeAndReport("LinkedList", "Access element 0", () -> accessElementXManyTimes(linkedList, 0, 100_000));

        // Measure accessing the middle element between two list types
        timeAndReport("ArrayList", "Access element 5.000.000", () -> accessElementXManyTimes(arrayList, 5_000_000, 1_000));
        timeAndReport("LinkedList", "Access element 5.000.000", () -> accessElementXManyTimes(linkedList, 5_000_000, 1_000));

        // Measure accessing the last element between two list types
        timeAndReport("ArrayList", "Access element 10.000.000", () -> accessElementXManyTimes(arrayList, 10_000_000 - 1, 100_000));
        timeAndReport("LinkedList", "Access element 10.000.000", () -> accessElementXManyTimes(linkedList, 10_000_000 - 1, 100_000));

        // What is going on here?
        // Why is retrieving the first and the last element so fast, while retrieving the middle element
        // takes very long for the LinkedList? Think about it and then read the answer at the end of this file.
    }

    public static void fillListWithItems(List<Integer> listToFill) {
        // Add 10.000.000 numbers to the List that is passed into this function
        for (int i = 0; i < 10_000_000; i++) {
            listToFill.add(i);
        }
    }

    /**
     * Note that the number of repeats has been made configurable. This is because we need to perform the
     * task many times for the fast operations to be able to see some difference. But for the tasks where
     * the difference is
     */
    public static void accessElementXManyTimes(List<Integer> listToAccess, int index, int repeats) {
        // Access an element with a certain index a set amount of times
        for (int i = 0; i < repeats; i++) {
            listToAccess.get(index);
        }
    }

    private static void timeAndReport(String listType, String nameOfOperation, Runnable operation) {
        Instant start = Instant.now();

        try {
            operation.run();
        } catch (Exception e) {
            System.out.printf(
                    "Operation %s on list type %s caused error %s%n", nameOfOperation,
                    listType,
                    e.getMessage()
            );
        }

        Instant end = Instant.now();
        final Duration duration = Duration.between(start, end);

        System.out.printf(
                "%8s ms - %20s - %s%n", duration.toMillis(),
                listType,
                nameOfOperation
        );
    }

    /**
     * Answer to : Why are the timings of ArrayList and LinkedList so dramatically different?
     *
     * The big difference between ArrayList and LinkedList is the fact that ArrayList is backed by an Array and the
     * LinkedList creates a long chain of "nodes" that are linked together and form the list. The nodes actually link
     * to both their predecessor _and_ their successor in the list, to facilitate bidirectional traversal.
     *
     * This is also immediately why LinkedList takes so much more time to access the middle element. For the ArrayList,
     * this is the same as for any other element in the list. It simply adds the index to the address of the Array and
     * voila, it has the answer. The LinkedList however, must start at the beginning and continuously move forward
     * through the chain of nodes, keeping count. Once it has reached the desired index, it wil return that element.
     * This is really inefficient.
     *
     * The reason the last element has such fast lookup again is that LinkedList can go through the list in both
     * directions. When asked for a particular index, the LinkedList determines whether it is easier to start at the
     * beginning or the end of the list and then goes from there.
     */
}
