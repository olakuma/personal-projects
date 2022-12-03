import java.awt.*;
// import java.awt.geom.*;
import javax.swing.*;

public class TriangleIcon implements Icon {
    private int size;

    public TriangleIcon(int size)
    {
        this.size = size;
    }

    public int getIconWidth()
    {
        return size;
    }

    public int getIconHeight()
    {
        return size/2;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        int[] p = {0, size/2, size}; // x-coordinate
        int[] q = {size, 0, size}; // y-coordinates

        Polygon tri = new Polygon(p, q, 3);

        // g2.setColor(Color.YELLOW);
        g2.fill(tri);
    }
}


