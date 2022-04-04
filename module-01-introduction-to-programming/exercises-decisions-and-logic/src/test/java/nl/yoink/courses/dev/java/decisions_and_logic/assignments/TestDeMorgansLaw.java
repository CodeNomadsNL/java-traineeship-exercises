package nl.yoink.courses.dev.java.decisions_and_logic.assignments;

import nl.yoink.courses.dev.java.decisions.assignments.ExerciseDeMorgansLaw;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link ExerciseDeMorgansLaw}
 */
class TestDeMorgansLaw {

    private static Stream<Object[]> createArguments(final BinaryOperator<Boolean> operator){
        return Arrays.stream(new boolean[][]{
                {false, false},
                {false, true},
                {true, false},
                {true, true}})
                .map(pair -> new Object[]{pair[0], pair[1], operator.apply(pair[0], pair[1])});
    }

    static Stream<Object[]> testNegationOfDisjunction(){
        return createArguments((a, b) -> !(a || b));
    }
    @ParameterizedTest
    @MethodSource
    public void testNegationOfDisjunction(boolean a, boolean b, boolean expected) {
        final ExerciseDeMorgansLaw exampleInstance = new ExerciseDeMorgansLaw();
        assertEquals(expected, exampleInstance.negationOfDisjunction(a, b));
    }

    static Stream<Object[]> testNegationOfConjunction(){
        return createArguments((a, b) -> !(a && b));
    }
    @ParameterizedTest
    @MethodSource
    public void testNegationOfConjunction(boolean a, boolean b, boolean expected) {
        final ExerciseDeMorgansLaw exampleInstance = new ExerciseDeMorgansLaw();
        assertEquals(expected, exampleInstance.negationOfConjunction(a, b));
    }

    static Stream<Object[]> testDisjunction(){
        return createArguments((a, b) -> a || b);
    }
    @ParameterizedTest
    @MethodSource
    public void testDisjunction(boolean a, boolean b, boolean expected) {
        final ExerciseDeMorgansLaw exampleInstance = new ExerciseDeMorgansLaw();
        assertEquals(expected, exampleInstance.disjunction(a, b));
    }

    static Stream<Object[]> testConjunction(){
        return createArguments((a, b) -> a && b);
    }
    @ParameterizedTest
    @MethodSource
    public void testConjunction(boolean a, boolean b, boolean expected) {
        final ExerciseDeMorgansLaw exampleInstance = new ExerciseDeMorgansLaw();
        assertEquals(expected, exampleInstance.conjunction(a, b));
    }
}
