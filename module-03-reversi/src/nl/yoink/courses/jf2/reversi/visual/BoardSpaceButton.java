package nl.yoink.courses.jf2.reversi.visual;

import javax.swing.*;
import java.awt.*;

public class BoardSpaceButton extends JButton {

    private VisualPiece pieceOnSpace = null;

    public void setPieceOnSpace(VisualPiece newPiece) {
        this.pieceOnSpace = newPiece;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, g.getClipBounds().width, g.getClipBounds().height);
        g.setColor(Color.GRAY);
        g.drawRect(0, 0, g.getClipBounds().width, g.getClipBounds().height);

        if (this.pieceOnSpace != null) {

            if (this.pieceOnSpace.getOwner() == 1) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
            }
            g.fillOval(g.getClipBounds().width / 4, g.getClipBounds().height / 4, g.getClipBounds().width / 2, g.getClipBounds().height / 2);

            if (this.pieceOnSpace.getOwner() == 2) {
                g.setColor(Color.BLACK);
                g.drawOval(g.getClipBounds().width / 4, g.getClipBounds().height / 4, g.getClipBounds().width / 2, g.getClipBounds().height / 2);
            }
        }
    }
}
