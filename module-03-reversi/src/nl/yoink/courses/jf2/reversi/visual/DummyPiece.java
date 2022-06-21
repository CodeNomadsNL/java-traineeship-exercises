package nl.yoink.courses.jf2.reversi.visual;

public record DummyPiece(int owner) implements VisualPiece {

    @Override
    public int getOwner() {
        return this.owner;
    }
}
