import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ColorPanel{
    private JPanel panel;
    public ColorPanel(){
        panel = new JPanel(new GridLayout(1, 3, 10, 10)); // 1 row, 3 columns, with 10px horizontal and vertical gap
        panel.setBackground(Color.BLACK);
        panel.add(new ColorButton(Color.yellow, "Yellow").geButton());
        panel.add(new ColorButton(Color.green, "Green").geButton());
        panel.add(new ColorButton(Color.BLUE, "Blue").geButton());

        
    }

    public JPanel getPanel(){
        return panel;
    }
}
