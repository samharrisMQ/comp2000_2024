import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    class Canvas extends JPanel {

        Grid grid;
        Trail trail;

        public Canvas() {
            setPreferredSize(new Dimension(720,720));
            grid = new Grid();
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
          //  trail.drawMouseTrails(g, 21, 32);
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}