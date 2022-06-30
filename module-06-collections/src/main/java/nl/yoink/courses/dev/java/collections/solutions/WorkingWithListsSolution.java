package nl.yoink.courses.dev.java.collections.solutions;

import nl.yoink.courses.dev.java.collections.assignments.Person;
import nl.yoink.courses.dev.java.collections.assignments.PersonCollectionHelper;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithListsSolution {


    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        PersonCollectionHelper.fillCollectionWithPeople(people);

        // You now have a list filled with Person-objects (see the Person-class for details). Iterate of the list
        // and count the number of Persons that are under 30 years of age. Also print their names on the console
        // while you're counting.
        int countUnderThirty = 0;
        for (Person p: people) {
            if (p.getAge() < 30) {
                countUnderThirty += 1;
                System.out.println(p.getName() + " is under 30!");
            }
        }
        System.out.println("There are " + countUnderThirty + " people under 30 years of age");


        // Create a new List<Person> and add all Persons to it whose names start with an "E". Which of those identifies
        // as Male?
        List<Person> peopleWithE = new ArrayList<>();
        for (Person p: people) {
            if (p.getName().startsWith("E")) {
                peopleWithE.add(p);
            }
        }

        for (Person p: peopleWithE) {
            if (p.getIdentifiesAs().equals("Male")) {
                System.out.println(p.getName());
            }
        }

        // Create a new List<Person> and put all Persons from the people list in it, but in reverse order
        // Can you still use the enhanced-for loop?

        // Actually you can, as long as you keep inserting the new item in front of everythin else
        List<Person> reversedPeople1 = new ArrayList<>();
        for (Person p: people) {
            reversedPeople1.add(0, p);
        }

        // The other way is to traverse the list in reverse order (start at .size() - 1 and go to 0)
        List<Person> reversedPeople2 = new ArrayList<>();
        for (int i = people.size() - 1; i >= 0; i--) {
            reversedPeople2.add(people.get(i));
        }

        System.out.println(reversedPeople1);
        System.out.println(reversedPeople2);
        System.out.println("Are they equal? " + reversedPeople1.equals(reversedPeople2));

    }

}
