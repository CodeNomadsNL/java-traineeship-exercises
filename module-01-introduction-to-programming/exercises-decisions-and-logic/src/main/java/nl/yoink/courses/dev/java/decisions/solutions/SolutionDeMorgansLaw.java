package nl.yoink.courses.dev.java.decisions.solutions;

public class SolutionDeMorgansLaw {

    public boolean negationOfDisjunction(final boolean a, final boolean b) {
        return !a && !b;
    }

    public boolean negationOfConjunction(final boolean a, final boolean b) {
        return !a || !b;
    }

    public boolean conjunction(final boolean a, final boolean b) {
        return !(!a || !b);
    }

    public boolean disjunction(final boolean a, final boolean b) {
        return !(!a && !b);
    }
}
