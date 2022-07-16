package mazegenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JPanel;

import mycomponents.*;

public class MazeGenerator extends JFrame {
    private static final long serialVersionUID = 1L;

    private TitleLabel = "Maze Game";

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
        add(TitleLabel, BorderLayout.PAGE_START);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MazeGenerator();
            }
        });
    }
}
