package nl.yoink.courses.jf2.reversi.visual;

/**
 * This class is used to be able to start the GUI even without a functioning board implementation. It will always
 * be of size 12x12 and have no pieces at all.
 */
public class DummyBoard implements VisualBoard {
    @Override
    public int getBoardSize() {
        return 12;
    }

    @Override
    public VisualPiece getPieceAtCoordinate(int x, int y) {

        if (x == 1) {
            return new DummyPiece(1);
        } else if (y == 1) {
            return new DummyPiece(2);
        }

        return null;
    }
}
