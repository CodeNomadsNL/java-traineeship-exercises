package nl.yoink.courses.dev.java.intro.simple.gui;

import javax.swing.*;
import java.util.Random;

/**
 * The SimpleGUI program demonstrates an application with a Graphical User Interface (GUI). On startup, this application
 * will display a window with some controls to allow you to play Higher/Lower - Guess the Number. The possible ways to
 * interact with users are limited only by your imagination, since there are plenty of Swing components ready to use and
 * you could even write your own components.
 *
 * What makes an application a GUI-app:
 *  - It interacts with a user through a window containing graphical components
 *  - It can display one or more windows as desired
 *  - It is generally an application meant for usage by one single concurrent user
 *
 * Note that the SimpleGUI class extends JFrame, which is a class from the SwingUI library. This makes it possible to
 * create and add user interface components and display as a window.
 */
public class SimpleGUI extends JFrame {

    /**
     * The main method is where Java starts the execution of any program. Here it will create a SimpleConsole and
     * run it. Arguments from the command line are ignored.
     *
     * @param args these are ignored
     */
    public static void main(String[] args) {
        new SimpleGUI();
    }

    // A utility to generate random numbers (initialised with the current time for additional randomness)
    private final Random randomNumberGenerator = new Random(System.currentTimeMillis());

    // State variables for the guess-the-number game
    private boolean gameInProgress = false;
    private int secretNumber;
    private int numberOfGuesses;
    private GuessOutcome latestGuessOutcome;

    // SwingUI labels to display text
    private JLabel welcomeLabel = new JLabel("Welcome to Guess the number!");
    private JLabel statusLabel = new JLabel("Click 'Start!' to start a game!");
    private JLabel numberOfGuessesLabel = new JLabel("Waiting to start new game...");

    // SwingUI input field to allow users to enter numbers
    private JTextField inputGuess = new JTextField();

    // SwingUI buttons to allow users to interact with the game
    private JButton startOrResetGameButton = new JButton("Start new game...");
    private JButton enterGuessButton = new JButton("Guess!!");

    /**
     * The constructor for SimpleGUI also creates all the components displayed on the screen. This example uses
     * manual positioning of the components, but there are also LayoutManagers which can help you create more flexible
     * layouts.
     */
    public SimpleGUI() {

        // Set properties of the window we are creating
        this.setSize(500, 250);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set coordinates and size of all elements and add them to the JFrame (this.add is inherited from JFrame)
        welcomeLabel.setBounds(40, 4, 420, 16 );
        this.add(welcomeLabel);

        statusLabel.setBounds(40, 24, 420, 16);
        this.add(statusLabel);

        numberOfGuessesLabel.setBounds(40, 44, 420, 16);
        this.add(numberOfGuessesLabel);

        inputGuess.setEnabled(false);
        inputGuess.setBounds(40, 64, 120, 24);
        this.add(inputGuess);

        enterGuessButton.setEnabled(false);
        enterGuessButton.setBounds(40, 90, 120, 24);
        this.add(enterGuessButton);

        startOrResetGameButton.setEnabled(true);
        startOrResetGameButton.setBounds(180, 90, 180, 24);
        this.add(startOrResetGameButton);

        // Register an action listener to respond to the user clicking the button with "Start a new game ..." text
        startOrResetGameButton.addActionListener( event -> {

            /* Note that this block of code between the curly braces { } is a lambda function. We are passing a function
             * to the addActionListener method. When the user clicks the associated button, this function will be run.
             * Since we define the function here in SimpleGUI, it has access to all the methods and fields of
             * SimpleGUI.
             */

            this.reset();

            this.updateUI();
        });

        // Register an action listener to respond to the user clicking the button with "Guess!!" text
        enterGuessButton.addActionListener( event -> {

            /* Note that this block of code between the curly braces { } is a lambda function. We are passing a function
             * to the addActionListener method. When the user clicks the associated button, this function will be run.
             * Since we define the function here in SimpleGUI, it has access to all the methods and fields of
             * SimpleGUI.
             */

            int newGuess = 0;

            // Before we can test the number, we need to make sure the user entered a number. Parsing the input will
            // gives us a number, or a NumberFormatException
            try {
                newGuess = Integer.parseInt(this.inputGuess.getText());
            } catch (NumberFormatException nfe) {
                this.statusLabel.setText("Please enter a valid number");
                this.inputGuess.setText("");

                // Here we return out of the action listener, because we did not get a valid input. Instead of
                // continuing without a valid guess, we stop the handler and return control to the user.
                return;
            }

            this.latestGuessOutcome = this.guess(newGuess);

            this.updateUI();
        });

        // Display the window now that everything has been added to it
        this.setVisible(true);

    }

    /**
     * This method updates the components on the window after a button has been pressed
     */
    private void updateUI() {
        // When a game is in progress, the guess field and button should be enabled, disabled otherwise
        this.enterGuessButton.setEnabled(this.gameInProgress);
        this.inputGuess.setEnabled(this.gameInProgress);
        this.statusLabel.setText("");

        if (this.gameInProgress) {
            // If a game is (still) in progress at this point, a number has been guessed which was incorrect.
            this.welcomeLabel.setText("Try guessing the number between 0 and 500");
            this.numberOfGuessesLabel.setText("You have guessed " + this.numberOfGuesses + " times already");

            if (this.latestGuessOutcome != null) {
                // When a game starts, the latestGuessOutome is null and then we don't show this message
                this.statusLabel.setText("Your guess was " + this.latestGuessOutcome);
            }
        } else {
            this.welcomeLabel.setText("Congratulations! You've guessed " + this.secretNumber);
            this.numberOfGuessesLabel.setText("You needed " + this.numberOfGuesses + " guesses!");
        }
    }

    /**
     * The reset method starts a new game. It generates a new random number and sets the state variables to the
     * appropriate values for an active game.
     */
    private void reset() {
        this.numberOfGuesses = 0;
        this.latestGuessOutcome = null;
        this.secretNumber = this.randomNumberGenerator.nextInt(500);
        this.gameInProgress = true;
    }

    /**
     * Determines whether the supplied number is the secret number, or whether it's too high or too low.
     *
     * @param number the newly guessed number
     * @return a value of the GuessOutcome enumeration, indicating the result of the guess
     */
    private GuessOutcome guess(int number) {
        this.numberOfGuesses++;
        int relativePositionToSecretNumber = Integer.compare(number, this.secretNumber);

        if (relativePositionToSecretNumber < 0) {
            return GuessOutcome.TOO_LOW;
        } else if (relativePositionToSecretNumber == 0) {
            this.gameInProgress = false;
            return GuessOutcome.CORRECT;
        } else {
            return GuessOutcome.TOO_HIGH;
        }
    }
}

/**
 * Enumerates the possible outcomes of a guess. The names speak for themselves.
 */
enum GuessOutcome {
    TOO_LOW, CORRECT, TOO_HIGH;
}
