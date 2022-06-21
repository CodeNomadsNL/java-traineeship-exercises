package nl.yoink.courses.jf2.reversi;

import nl.yoink.courses.jf2.reversi.visual.VisualReversiFrame;

import javax.swing.*;

public class Reversi {

    public static void main(String[] args) {
        VisualReversiFrame reversiFrame = new VisualReversiFrame();

        reversiFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        reversiFrame.setVisible(true);
    }

}
