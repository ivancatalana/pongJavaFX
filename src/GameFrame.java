import java.awt.*;

import javax.swing.*;
import javax.swing.text.html.ImageView;

public class GameFrame extends JFrame {


    GamePanel panel;

    GameFrame() {

        panel = new GamePanel();

        this.add(panel);

        this.setTitle("Pong Game");

        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();

        this.setVisible(true);

        this.setLocationRelativeTo(null);

    }

}