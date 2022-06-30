package nl.yoink.courses.dev.java.collections.solutions;

import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleListsSolution {

    public static void main(String[] args) {
        // Create an ArrayList and add several things to it
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Something");
        myList.add("ordered");
        myList.add("can");
        myList.add("be");
        myList.add("stored");
        myList.add("in");
        myList.add("a");
        myList.add("List");

        // Uncommenting the next line will show you exactly what is in your list:
        System.out.println(myList);

        // Try adding the same element multiple times and then print the contents again. Did you expect the results?
        myList.add("Double");
        myList.add("Double");
        myList.add("Check");
        myList.add("Check");

        // A List allows multiple copies of the same value. The important aspect in a List is the order, not the
        // cardinality of the value.
        System.out.println(myList);

        // Try to remove some of the values you put in your list
        // What happens if you try to remove one of your duplicate values?
        myList.remove("Check");

        // The answer is: only one matching item gets removed, because .remove() will only delete the first value
        // finds to be equal.
        System.out.println(myList);

        // Try to find the position in the list of one of your values
        int indexOfStored = myList.indexOf("stored");

        System.out.println("Index of stored is " + indexOfStored);

        // Now change you ArrayList into a LinkedList. What changes?

        // Answer: nothing really changes. Both ArrayList and LinkedList are implementations of List and therefor
        // have the same functional behaviour. There is a difference, but that only comes to light in some cases.
        // See the PerformanceSample for examples of this.

        LinkedList<String> myList2 = new LinkedList<>();

        myList2.add("Something");
        myList2.add("ordered");
        myList2.add("can");
        myList2.add("be");
        myList2.add("stored");
        myList2.add("in");
        myList2.add("a");
        myList2.add("List");

        // Uncommenting the next line will show you exactly what is in your list:
        System.out.println(myList2);

        // Try adding the same element multiple times and then print the contents again. Did you expect the results?
        myList2.add("Double");
        myList2.add("Double");
        myList2.add("Check");
        myList2.add("Check");

        // A List allows multiple copies of the same value. The important aspect in a List is the order, not the
        // cardinality of the value.
        System.out.println(myList2);

        // Try to remove some of the values you put in your list
        // What happens if you try to remove one of your duplicate values?
        myList2.remove("Check");

        // The answer is: only one matching item gets removed, because .remove() will only delete the first value
        // finds to be equal.
        System.out.println(myList2);

        // Try to find the position in the list of one of your values
        int indexOfStored2 = myList2.indexOf("stored");

        System.out.println("Index of stored is " + indexOfStored2);

    }
}
