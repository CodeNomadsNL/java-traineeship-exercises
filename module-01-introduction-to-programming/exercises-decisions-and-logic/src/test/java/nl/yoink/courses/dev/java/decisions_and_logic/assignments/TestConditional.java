package nl.yoink.courses.dev.java.decisions_and_logic.assignments;

import nl.yoink.courses.dev.java.decisions.assignments.ExerciseConditional;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link ExerciseConditional}
 */
class TestConditional {

    static Collection<Arguments> testMax(){
        List<Arguments> result = new LinkedList<>();
        for (int i = -3; i <= 3; i++) {
            for (int j = -3; j <= 3; j++) {
                result.add(Arguments.of(i, j, Math.max(i, j)));
            }
        }
        return result;
    }

    @ParameterizedTest
    @MethodSource
    public void testMax(final int a, final int b, int expected) {
        final ExerciseConditional exampleInstance = new ExerciseConditional();
        assertEquals(expected, exampleInstance.returnMax(a, b));
    }

    static Stream<Arguments> testReturnNegativeOrZeroOrPositive(){
        return Stream.of(
                Arguments.of(Integer.MIN_VALUE, "negative"),
                Arguments.of(-2, "negative"),
                Arguments.of(-1, "negative"),
                Arguments.of(0, "zero"),
                Arguments.of(1, "positive"),
                Arguments.of(2, "positive"),
                Arguments.of(Integer.MAX_VALUE, "positive"));
    }

    @ParameterizedTest
    @MethodSource
    public void testReturnNegativeOrZeroOrPositive(final int number, final String expected) {
        final ExerciseConditional exampleInstance = new ExerciseConditional();
        assertEquals(expected, exampleInstance.returnNegativeOrZeroOrPositive(number));
    }
}
