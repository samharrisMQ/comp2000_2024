import java.awt.*;
import java.awt.Graphics;

//create array to store last 100 positions of mousePos
//method called drawMouseTrails ??

public class Trail {
    //Fields
    int mX;
    int mY;

    //constructors
    public Trail(int mX, int mY) {
        this.mX = mX;
        this.mY = mY;
    }

    //methods
    public void paint(Graphics g, Point mousePos) {
        g.setColor(Color.BLACK);
        g.fillOval(mousePos.x, mousePos.y, 10, 10);
        System.out.println(mousePos.x);
    }

    public void drawMouseTrails(Graphics g, int mouseX, int mouseY) {
        g.drawOval(mouseX, mouseY, 10, 10);
    }
}
