import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;;

public class View extends JPanel implements ChangeListener {
    private JFrame frame;
    private JPanel panel, panel1, sliderPanel, colorPanel, buttonPanel;
    private JButton recButton, triButton, cirButton, redButton, bluButton, yelButton;
    private JSlider slider;
    private Controller controller;

    private boolean[] Shapes = {true, false, false}; // triangle[0], rectangle[1], circle[2] 
    private boolean[] Colors = {true, false, false};  // yellow[0], blue[1], red[2]

    public View(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(60, 50));
        frame.setSize(800, 850);

        controller = new Controller();

        // panel = new JPanel();
     
        // panel.setLocation(10, 100);
        // panel.setSize(100, 600);
        // frame.add(panel);

        recButton = new JButton("Rectangle");
        // recButton.setBounds(150, 10, 150, 75);
        // frame.add(recButton);

        triButton = new JButton("Triangle");
        // triButton.setBounds(310, 10, 150, 75);
        // frame.add(triButton);

        cirButton = new JButton("Circle");
        // cirButton.setBounds(470, 10, 150, 75);
        // frame.add(cirButton);

        slider = new JSlider(JSlider.VERTICAL, 20, 150, 20);
        slider.setPreferredSize(new Dimension(50, 500));
        // slider.setBounds(10, 10, 50, 750);
        
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.addChangeListener(this);

        //rectangle button listener
        recButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                checkShape(1);
                frame.repaint();
            }
        });

        triButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                checkShape(0);
                frame.repaint();
            }
        });

        cirButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                checkShape(2);
                frame.repaint();
            }
        });

        // panel.add(slider);
        redButton = new JButton("Red");
        // redButton.setBounds(150, 725, 150, 75);
        // frame.add(redButton);

        bluButton = new JButton("Blue");
        // bluButton.setBounds(310, 725, 150, 75);
        // frame.add(bluButton);

        yelButton = new JButton("Yellow");
        // yelButton.setBounds(470, 725, 150, 75);
        // frame.add(yelButton);

        redButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                checkColor(2);
                frame.repaint();
            }
        });

        bluButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                checkColor(1);
                frame.repaint();
            }
        });

        yelButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                checkColor(0);
                frame.repaint();
            }
        });
        
        panel = new JPanel() {
            @Override
            public void paint(Graphics g)
            {
                if (Shapes[0] == true)
                {
                    drawTriangle(g);
                }
                else if (Shapes[1] == true)
                {
                    drawRectangle(g);
                }
                else if (Shapes[2] == true)
                {
                    drawCircle(g);
                }
            }

            public void drawTriangle(Graphics g)
            {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Color[] colors = controller.getColors();

                if (Colors[0] == true)
                {
                    g2.setColor(colors[0]);
                }
                else if (Colors[1] == true)
                {
                    g2.setColor(colors[1]);
                }
                else if (Colors[2] == true)
                {
                    g2.setColor(colors[2]);
                }

                int center = (((825 - slider.getValue())/2) - 50);

                TriangleIcon triangle = new TriangleIcon(slider.getValue());
                triangle.paintIcon(cirButton, g2, center, center);

            }

            public void drawRectangle(Graphics g)
            {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Color[] colors = controller.getColors();

                if (Colors[0] == true)
                {
                    g2.setColor(colors[0]);
                }
                else if (Colors[1] == true)
                {
                    g2.setColor(colors[1]);
                }
                else if (Colors[2] == true)
                {
                    g2.setColor(colors[2]);
                }

                int center = (((825 - slider.getValue())/2) - 50);

                RectangleIcon rectangle = new RectangleIcon(slider.getValue(), 200);
                rectangle.paintIcon(recButton, g2, center, center);

            }

            public void drawCircle(Graphics g)
            {
                Graphics2D g2 = (Graphics2D)g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Color[] colors = controller.getColors();

                if (Colors[0] == true)
                {
                    g2.setColor(colors[0]);
                }
                else if (Colors[1] == true)
                {
                    g2.setColor(colors[1]);
                }
                else if (Colors[2] == true)
                {
                    g2.setColor(colors[2]);
                }

                int center = (((825 - slider.getValue())/2) - 50);

                Circle circle = new Circle(slider.getValue(), slider.getValue());
                circle.paintIcon(recButton, g2, center, center);

            }
        };

        panel1 = new JPanel(new BorderLayout());
        sliderPanel = new JPanel(new BorderLayout());
        colorPanel = new JPanel();
        buttonPanel = new JPanel();

        colorPanel.add(yelButton);
        colorPanel.add(redButton);
        colorPanel.add(bluButton);

        buttonPanel.setSize(250, 250);
        buttonPanel.add(triButton);
        buttonPanel.add(cirButton);
        buttonPanel.add(recButton);

        sliderPanel.add(slider);

        panel1.add(panel);

        frame.add(sliderPanel, BorderLayout.WEST);
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(colorPanel, BorderLayout.SOUTH);
        frame.add(panel1, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // public static void main(String[] args) {
    //     new View();
    // }

    @Override
    public void stateChanged(ChangeEvent e) {
        frame.repaint();
    }

    public void checkShape(int shape)
    {
        for(int i = 0; i < Shapes.length; i++)
        {
            if(i == shape)
            {
                Shapes[i] = true;
            }
            else{
                Shapes[i] = false;
            }
        }
    }

    public void checkColor(int col)
    {
        for(int i = 0; i < Colors.length; i++)
        {
            if(i == col)
            {
                Colors[i] = true;
            }
            else{
                Colors[i] = false;
            }
        }
    }
}
