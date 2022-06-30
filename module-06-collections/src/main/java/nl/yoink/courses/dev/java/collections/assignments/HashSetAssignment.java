package nl.yoink.courses.dev.java.collections.assignments;

public class HashSetAssignment {

    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "Employee[name=" + this.name + "]";
        }
    }

    public static void main(String[] args) {
        // In this file we will be discovering what makes a HashSet work and what you have
        // to be aware of. The Employee-class above is intentionally broken to demonstrate
        // a pitfall of HashSets.

        // Let's start with a simple Set. Create a HashSet<String> and add some names to it

        // ...

        // Add some more and also try to add some names you've already used. Then print it again
        // What do you see? Did you expect to see this?

        //...


        // Create a HashSet<Employee> and add three Employees to it. Then print the
        // set out to the console to see its contents.

        // ...

        // Now add another Employee with the same name as one you've already added and print the set
        // What do you see? Did you expect to see this?

        // ...

        // Answer: Sandy is in the Set twice. This is strange, isn't it? When we added Strings, the
        // second 'Sandy' was not allowed in. Now we are using Employees and now they are allowed in.
        // How!? The HashSet determines equality with a series of calls to hashCode() and equals().
        // These two methods are related to each other:

        // When a call to equals() between two objects returns true, the hashCode() values of these
        // two objects must be the same as well.

        // HashSet uses this, it calls hashCode() and then looks for other objects with the same hashCode()
        // in its collection. If it finds none, the object is unique and may be added. If it does find another
        // object with the same hashCode()-value, it will then call equals() to check if the objects are
        // actually equal.

        // Our Employee class does not have an equals() method, meaning it reverts back to the one from Object.
        // The equals method of Object only returns true for the exact same object.

        // Let's correct this: Add a method public boolean equals(Object o) {} to Employee. You can use
        // IntelliJ's code generation to do this for you if you want.

        // Now rerun the example and see what happens.

        // ... Wait... Sandy is _still_ in there twice!? But how!? Remember the contract between hashCode()
        // and equals()? If two objects are considered equal, they must also have the same hashCode(). Right now,
        // the hashCode()-method of Employee delegates back to the super-class (which is Object). Since the two
        // Sandy-employee-instances are not the exact same instances, the hashCodes() will be different. Here you
        // can see that HashSet really relies on the values of hashCode(), because it never called equals(). If it
        // had, it would have seen that the two Sandy's were the same.

        // Okay, so how do you fix a hashCode() method? Well, there are plenty of ways to screw it up. That is
        // why it is recommended to have a framework do i for you, or use IntelliJ's code generation.

        // Delete the hashCode()-function from Employee and create a new one, either by hand or using IntelliJ's
        // code feature. The gist of a hashCode() is, it should include all of its fields that have an impact on
        // the object's equality.

        // Now that hashCode() and equals() are properly implemented, the Set behaves as expected.

    }

}
