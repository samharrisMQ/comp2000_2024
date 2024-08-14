import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//create array to store last 100 positions of mouse
//method called drawMouseTrails ??

public class Trail implements MouseMotionListener {
    //fields
    Point[] trailPoints;
    int[] trailLife;
    int trailLength;
    int frameCount;

    //constructors
    public Trail(int length) {
        trailLength = length;
        trailPoints = new Point[trailLength];
        trailLife = new int[trailLength];

        for (int i=0;i<trailLength;i++) {
            trailPoints[i] = new Point(-1,-1);
            trailLife[i] = 0;
        }
        frameCount = 0;
    }

    //methods
    public void updateTrail(Point currentPoint) {
        for (int i=trailLength-1;i>0;i--) {
            trailPoints[i] = trailPoints[i - 1];
        }
        trailPoints[0] = currentPoint;
        trailLife[0] = 0;
    }


    public void drawMouseTrails(Graphics g, int trailSize) {
        g.setColor(new Color(255,0,0,100));
        for(int i=0; i<trailLength;i++) {
            if (trailPoints[i].x != -1 && trailPoints[i].y != -1) {
                int trailX = trailPoints[i].x - trailSize / 2;
                int trailY = trailPoints[i].y - trailSize / 2;
                g.fillOval(trailX, trailY, trailSize, trailSize);
                trailLife[i]++; 
                if (trailLife[i] >= 100) { 
                    trailPoints[i] = new Point(-1, -1);
                    trailLife[i] = 0;
                }
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        updateTrail(e.getPoint());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        updateTrail(e.getPoint());
    }
}
