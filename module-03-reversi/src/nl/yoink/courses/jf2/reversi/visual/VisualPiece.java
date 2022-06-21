package nl.yoink.courses.jf2.reversi.visual;

/**
 * An implementation of VisualPiece is expected to provide the GUI with information about a piece on the board.
 */
public interface VisualPiece {

    /**
     * Get a number representing the player that owns this piece.
     * @return <code>1</code> for Player 1
     *         <code>2</code> for Player 2
     */
    int getOwner();

}
