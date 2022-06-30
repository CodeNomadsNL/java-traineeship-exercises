package nl.yoink.courses.dev.java.collections.assignments;

import java.util.Collection;

public class PersonCollectionHelper {
    
    public static void fillCollectionWithPeople(Collection<Person> target) {
        target.add(new Person("Henk", 26, "Male"));
        target.add(new Person("Jack", 27, "Male"));
        target.add(new Person("Joyce", 24, "Female"));
        target.add(new Person("Karen", 31, "Female"));
        target.add(new Person("Alex", 29, "Non-binary"));
        target.add(new Person("Jim", 42, "Male"));
        target.add(new Person("Jim", 33  , "Male"));
        target.add(new Person("Stewart", 34  , "Male"));
        target.add(new Person("Anne", 31  , "Female"));
        target.add(new Person("Jinx", 24  , "Non-binary"));
        target.add(new Person("Mace", 26  , "Non-binary"));
        target.add(new Person("Jocelyne", 32  , "Female"));
        target.add(new Person("Patricia", 33 , "Female"));
        target.add(new Person("Charlene", 43, "Female"));
        target.add(new Person("Baylee", 22, "Female"));
        target.add(new Person("Braden", 27, "Male"));
        target.add(new Person("Chris", 28, "Male"));
        target.add(new Person("Dean", 35, "Male"));
        target.add(new Person("Ellis", 35, "Non-binary"));
        target.add(new Person("Eduard", 39, "Male"));
        target.add(new Person("Evelyn", 23, "Female"));
        target.add(new Person("Frankie", 38, "Male"));
        target.add(new Person("Harper", 44, "Male"));
        target.add(new Person("Haylee", 34, "Female"));
        target.add(new Person("Howard", 52, "Male"));
        target.add(new Person("Hazel", 33, "Non-binary"));
        target.add(new Person("Janet", 31, "Female"));
        target.add(new Person("Jax", 30, "Male"));
        target.add(new Person("Kate", 28, "Female"));
    }
    
}