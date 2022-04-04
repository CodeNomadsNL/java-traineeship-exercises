package nl.yoink.courses.dev.java.intro.simple.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The SimpleConsole program demonstrates a very basic interaction with the console. This application is meant to be
 * started from the command line by typing "java nl.yoink.courses.dev.java.intro.simple.console.SimpleConsole". It will
 * then ask you to type in a name and press ENTER.
 *
 * What makes an application a Console-app:
 *  - It is started from the command line
 *  - It only interacts with a user through the shell / terminal
 *  - It does _not_ display any windows
 *  - It generally does not listen to any network ports
 *  - It is generally an application meant for usage by one single concurrent user
 */
public class SimpleConsole {

    /**
     * The main method is where Java starts the execution of any program. Here it will create a SimpleConsole and
     * run it. Arguments from the command line are ignored.
     *
     * @param args these are ignored
     */
    public static void main(String[] args) {
        new SimpleConsole().run();
    }

    // BufferedReader wrapper for the Standard Input, allowing the use of readLine()
    private final BufferedReader standardIn = new BufferedReader(new InputStreamReader(System.in));

    /**
     * The run-method is where this application is performing its tasks.
     */
    public void run() {
        // Request the user to enter a name
        System.out.print("Please enter your name: ");
        String nameOfActiveUser = readLineFromStandardIn();

        // Print HELLO and then the entered name four times with increasing indentation just for fun
        System.out.println("HELLO!");
        for ( int i = 0 ; i < 4 ; i++ ) {
            System.out.print("  ".repeat(i));
            System.out.println(nameOfActiveUser);
        }
    }

    /**
     * This utility method hides the logic for reading a value from the console. It reads exactly one line of input
     * from the Standard Input and returns this value. In case something went wrong, the method returns a generic,
     * not very helpful, error message.
     *
     * @return the value read from the console, or a silly error message.
     */
    private String readLineFromStandardIn() {
        try {
            return this.standardIn.readLine();
        } catch (IOException ioe) {
            System.err.println("Something interrupted me trying to read data...");
            return "Wooops, something went wrong!";
        }
    }

}
