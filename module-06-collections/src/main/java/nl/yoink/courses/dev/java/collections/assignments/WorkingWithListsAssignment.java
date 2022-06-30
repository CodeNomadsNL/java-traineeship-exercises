package nl.yoink.courses.dev.java.collections.assignments;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithListsAssignment {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        PersonCollectionHelper.fillCollectionWithPeople(people);

        // You now have a list filled with Person-objects (see the Person-class for details). Iterate of the list
        // and count the number of Persons that are under 30 years of age. Also print their names on the console
        // while you're counting.

        // ...

        // Create a new List<Person> and add all Persons to it whose names start with an "E". Which of those identifies
        // as Male?

        // ...

        // Create a new List<Person> and put all Persons from the people list in it, but in reverse order
        // Can you still use the enhanced-for loop?

        // ...

    }

}
