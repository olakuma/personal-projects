import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RectangleIcon implements Icon {
    private int height;
    private int width;

    public RectangleIcon(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public int getIconHeight()
    {
        return height;
    }

    public int getIconWidth()
    {
        return width;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, height, width);

        // g2.setColor(Color.YELLOW);
        g2.fill(square);
    }
}
