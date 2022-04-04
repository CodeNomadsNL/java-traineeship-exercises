package nl.yoink.courses.dev.java.arrays.and.loops.solutions;

public class FunctionsSolution04BMI {

    // Implement the bmi function below before running this assignment
    public static void main(String[] args) {

        double myMassInKg = 99;
        double myHeightInCm = 1.87;
        double subjectBmi = bmi(myMassInKg, myHeightInCm);

        System.out.println("BMI of person with mass " + myMassInKg + "kg and height " + myHeightInCm + "m is: " +
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
        // Copy your implementation from `Functions02BMI` here:
        return mass / (bodyHeight * bodyHeight);
    }

    public static String insult(double bmi) {
        if (bmi < 18.5) {
            return "You’re underweight, you emo, you! Go binge some fast food!";
        } else if (bmi > 30) {
            return "You’re a whale, congratulations!";
        } else {
            return "You’re supposedly normal. Pffft, I bet you’re ugly!";
        }
    }

}
