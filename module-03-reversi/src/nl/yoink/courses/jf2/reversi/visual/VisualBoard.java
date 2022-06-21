package nl.yoink.courses.jf2.reversi.visual;

/**
 * An implementation of VisualBoard allows the GUI to access information about a Reversi board. With the specified
 * information, the GUI can render a board for the players to interact with.
 */
public interface VisualBoard {

    /**
     * Retrieves the size of the board along one of its edges. The number of squares on the board should be this
     * number multiplied by itself. E.g. for a 12x12 board, this function should return 12.
     *
     * @return the size of the board along one side
     */
    int getBoardSize();

    /**
     * Retrieves a VisualPiece for a given coordinate on the board. Alternatively, if no piece is place at those
     * coordinates, the function should return <code>null</code>.
     *
     * @param x the 0-based coordinate along the x-axis
     * @param y the 0-based coordinate along the y-axis
     * @return a {@link VisualPiece} if a piece is present on the board on these coordinates, <code>null</code> otherwise
     */
    VisualPiece getPieceAtCoordinate(int x, int y);

}
