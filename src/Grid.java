import java.awt.Graphics;
import java.awt.*;

public class Grid {
    //fields
    Cell[][] cells = new Cell[20][20];

    //constructors
    public Grid() {
        for(int i=0; i<cells.length; i++) {
            for(int j=0; j<cells[i].length; j++) {
                cells[i][j] = new Cell(10+35*i, 10+35*j);
            }
        }
    }

    //methods
    public void paint(Graphics g, Point mousePos) {

        for(int i=0; i<cells.length; i++) {
            for(int j=0; j<cells[i].length; j++) {
                cells[i][j].paint(g, mousePos);
            }
        }
    }
}
