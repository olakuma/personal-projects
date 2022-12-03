import java.awt.*;

public class Controller extends Model
{
    Model model;

    public Controller()
    {
        model = new Model();
    }

    public Color[] getColors()
    {
        return model.getColors();
    }
}
