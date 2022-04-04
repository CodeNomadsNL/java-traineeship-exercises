package nl.yoink.courses.dev.java.decisions.solutions;


import nl.yoink.courses.dev.java.decisions.assignments.ExerciseConditional;

/**
 * Solution for {@link ExerciseConditional}
 */
// Prevent the IDE from showing a warning as there is a build-in function (Math.max(a,b)) for this exercise.
@SuppressWarnings("ManualMinMaxCalculation")
public class SolutionConditional {
    public int max(final int a, final int b) {
        if(a > b){
            return a;
        }
        return b;
    }

    public String returnNegativeOrZeroOrPositive(int number){
        if(number < 0){
            return "negative";
        }
        else if(number > 0){
            return "positive";
        }
        else{
            return "zero";
        }
    }
}
