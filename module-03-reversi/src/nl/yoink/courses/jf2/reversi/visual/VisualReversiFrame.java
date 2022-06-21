package nl.yoink.courses.jf2.reversi.visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualReversiFrame extends JFrame {

    private VisualBoard currentBoard = new DummyBoard();

    private GridLayout layout;
    private BoardSpaceButton[][] fields;

    public VisualReversiFrame() {
        this.setMinimumSize(new Dimension(600, 600));

        this.relayout();
    }

    private void relayout() {
        var boardSize = this.currentBoard.getBoardSize();
        this.layout = new GridLayout(boardSize, boardSize);
        this.setLayout(this.layout);

        this.fields = new BoardSpaceButton[boardSize][boardSize];

        for (int x = 0; x < boardSize; x++ ) {
            for (int y = 0; y < boardSize; y++) {
                this.fields[x][y] = new BoardSpaceButton();
                this.fields[x][y].addActionListener(new CoordinatedActionListener(x, y));
                this.add(this.fields[x][y]);
            }
        }

        this.updateFields();
    }

    private void updateFields() {
        var boardSize = this.currentBoard.getBoardSize();

        for (int x = 0; x < boardSize; x++) {
            for (int y = 0; y < boardSize; y++) {
                VisualPiece piece = this.currentBoard.getPieceAtCoordinate(x, y);
                this.fields[x][y].setPieceOnSpace(piece);
            }
        }

        this.repaint();
    }

    private void fieldClicked(int x, int y) {
        System.out.println("Clicked on: " + x + ", " + y);
    }

    private class CoordinatedActionListener implements ActionListener {
        private final int x, y;

        CoordinatedActionListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            VisualReversiFrame.this.fieldClicked(this.x, this.y);
        }
    }
}
