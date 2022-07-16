package mazegenerator;

import javax.swing.JPanel;

import mycomponents.TitleLabel;

import java.awt.*;

public class Cell extends JPanel {
    private static final long serialVersionUID= 1L;
    private static final int SIZE = 20;

    public void paintComponent(Graphics g) {
        g.drawLine(0,0, SIZE, SIZE);
    }

    private void initGUI() {
        add(titleLabel, BorderLayout.PAGE_START);

        Cell cell = new Cell();
            add(cell, BorderLayout.CENTER);
    }
}
