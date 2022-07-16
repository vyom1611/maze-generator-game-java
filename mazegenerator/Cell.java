package mazegenerator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.*;

public class Cell extends JPanel {
    private static final long serialVersionUID= 1L;
    private static final SIZE = 20;

    public void paintComponent(Graphics g) {
        g.drawLine(0,0, SIZE, SIZE);
    }

    private void initGUI() {
        add(mainTitle, BorderLayout.PAGE_START);

        Cell cell = new Cell();
            add(cell, BorderLayout.CENTER);
    }
}
