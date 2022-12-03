import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class Circle implements Icon{

    private int height;
    private int width;

    public Circle(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }


    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, height);

        // g2.setColor(Color.YELLOW);
        g2.fill(circle);
    }

}