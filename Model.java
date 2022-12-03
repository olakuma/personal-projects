import java.awt.*;

public class Model
{
    Color yellow;
    Color red;
    Color blue;

    public Model()
    {
        yellow = new Color(255, 255, 0);
        red = new Color(255, 0, 0);
        blue = new Color(0, 0, 255);
    }

    public Color[] getColors()
    {
        Color[] colors = {yellow, blue, red};
        return colors;
    }

}