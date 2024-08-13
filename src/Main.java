import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    class Canvas extends JPanel {

        Grid grid;

        public Canvas() {
            grid = new Grid();
            setPreferredSize(new Dimension(720,720));
        }

        @Override
        public void paint(Graphics g) {
            System.out.println(getMousePosition());
            grid.paint(g);
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}