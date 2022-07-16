package mazegenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import mycomponents.*;

public class MazeGenerator extends JFrame {
    private static final long serialVersionUID = 1L;

    private mainTitle = "Maze Game";

    MazeGenerator()  {
        void initGUI();

        setTitle("Maze Generator");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initGUI() {
        add(mainTitle, BorderLayout.PAGE_START);
    }


}
