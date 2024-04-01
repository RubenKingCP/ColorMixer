import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorMixer {
    private static JFrame frame;
    private static JPanel colorPanel;
    private static CirclePanel circlePanel;
    public static void main(String[] args) {
        // Create components
        frame = new JFrame("Color Mixer");
        colorPanel = new JPanel();
        circlePanel = new CirclePanel(10);

        //Set frame operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CirclePanel circlePanel = new CirclePanel(100); // Setting padding between groups
        circlePanel.setBackground(Color.WHITE); // Setting background color of the panel

        // Adding CircleGroup instances to the panel
        circlePanel.addCircleGroup(new CircleGroup(80, Color.RED, 40, Color.RED));
        circlePanel.addCircleGroup(new CircleGroup(80, Color.GREEN, 40, Color.GREEN));
        circlePanel.addCircleGroup(new CircleGroup(80, Color.ORANGE, 40, Color.ORANGE));

        frame.add(circlePanel);
        frame.pack();
        frame.setVisible(true);
    }
}
