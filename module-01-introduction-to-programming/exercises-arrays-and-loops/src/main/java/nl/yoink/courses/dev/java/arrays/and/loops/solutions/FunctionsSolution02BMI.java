package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class FunctionsSolution02BMI {

    // Implement the bmi function below before running this assignment
    public static void main(String[] args) {

        double myMassInKg = 99;
        double myHeightInM = 1.87;

        System.out.println("BMI of person with mass " + myMassInKg + "kg and height " + myHeightInM + "m is: " +
                bmi(myMassInKg, myHeightInM));

    }

    /**
     * Implement a function that returns the Body Mass Index for the given measurements.
     *
     * @param mass the weight of the subject in kilograms
     * @param bodyHeight the height of the subject in centimeters
     * @return the Body Mass Index for the given measurements
     */
    public static double bmi(double mass, double bodyHeight) {
        return mass / (bodyHeight * bodyHeight);
    }

}
