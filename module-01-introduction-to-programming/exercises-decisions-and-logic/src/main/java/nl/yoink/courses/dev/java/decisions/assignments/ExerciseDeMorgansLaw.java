package nl.yoink.courses.dev.java.decisions.assignments;

public class ExerciseDeMorgansLaw {

    /**
     * Exercise: Apply DeMorgan's Law to rewrite the expression in this method. Note that the result should stay the
     * same!
     * Original expression: "(a || b)"
     *
     * @param a first boolean
     * @param b second boolean
     * @return the maximum of a and b.
     */
    public boolean negationOfDisjunction(final boolean a, final boolean b) {
        return !(a || b);
    }

    /**
     * Exercise: Apply DeMorgan's Law to rewrite the expression in this method. Note that the result should stay the
     * same!
     * Original expression: "!(a && b)"
     *
     * @param a first boolean
     * @param b second boolean
     * @return the maximum of a and b.
     */
    public boolean negationOfConjunction(final boolean a, final boolean b) {
        return !(a && b);
    }

    /**
     * Exercise: Apply DeMorgan's Law to rewrite the expression in this method. Note that the result should stay the
     * same!
     * Original expression: "a && b"
     *
     * Hint: There might not be a negation in this expression, but you can actually add a double negation and then
     * apply DeMorgan's Law. In other words: a && b == !(!(a && b))
     *
     * @param a first boolean
     * @param b second boolean
     * @return the maximum of a and b.
     */
    public boolean conjunction(final boolean a, final boolean b) {
        return a && b;
    }

    /**
     * Exercise: Apply DeMorgan's Law to the expression in this method. Note that the result should stay the
     * same!
     * Original expression: "a || b"
     *
     * Hint: There might not be a negation in this expression, but you can actually add a double negation and then
     * apply DeMorgan's Law. In other words: a || b == !(!(a || b))
     *
     * @param a first boolean
     * @param b second boolean
     * @return the maximum of a and b.
     */
    public boolean disjunction(final boolean a, final boolean b) {
        return a || b;
    }
}
