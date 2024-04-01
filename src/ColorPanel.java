import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ColorPanel {
    private JPanel panel;
    private ColorButton[] colorButtons; // Array to hold ColorButton instances

    public ColorPanel(Rgb rgb) {
        panel = new JPanel(new BorderLayout()); // Use BorderLayout
        panel.setBackground(Color.BLACK);

        // Create ColorButtons and add them to the panel
        colorButtons = new ColorButton[]{
            new ColorButton(this, Color.RED, "red", rgb),
            new ColorButton(this, Color.GREEN, "green", rgb),
            new ColorButton(this, Color.BLUE, "blue", rgb)
        };

        // Create a panel to hold the buttons at the bottom
        JPanel buttonPanel = new JPanel();
        for (ColorButton button : colorButtons) {
            buttonPanel.add(button.getButton());
        }

        //Add reset button
        buttonPanel.add(new ResetButton(rgb, this).getButton());
        // Add the button panel to the bottom of the main panel
        panel.add(buttonPanel, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return panel;
    }

    // Method to change the color of the panel
    public void changeColor(Color color) {
        panel.setBackground(color);
    }
}
