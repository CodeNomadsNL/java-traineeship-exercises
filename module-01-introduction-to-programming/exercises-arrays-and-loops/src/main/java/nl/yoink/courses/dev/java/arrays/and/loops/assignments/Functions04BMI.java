package nl.yoink.courses.dev.java.arrays.and.loops.assignments;

public class Functions04BMI {

    // Implement the bmi function below before running this assignment
    public static void main(String[] args) {

        double myMassInKg = 99;
        double myHeightInM = 1.87;
        double subjectBmi = bmi(myMassInKg, myHeightInM);

        System.out.println("BMI of person with mass " + myMassInKg + "kg and height " + myHeightInM + "cm is: " +
                subjectBmi);
        System.out.println("Insult generated: " + insult(subjectBmi));
    }

    /**
     * Implement a function that returns the Body Mass Index for the given measurements.
     *
     * @param mass the weight of the subject in kilograms
     * @param bodyHeight the height of the subject in centimeters
     * @return the Body Mass Index for the given measurements
     */
    public static double bmi(double mass, double bodyHeight) {
        // Copy your implementation from `Fuctions02BMI` here:
        return 0.0;
    }


    public static String insult(double bmi) {
        // Remove this line and add your own implementation:
        return "Whatever...";
    }

}
