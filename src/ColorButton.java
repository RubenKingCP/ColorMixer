import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class ColorButton{
    private JButton button;
    private Color color;
    private int rgbValue;

    public ColorButton(Color color, String name){
        this.color = color;
        button = new JButton(name);
        button.setPreferredSize(new Dimension(40, 40));
        button.setBackground(color);
        button.setForeground(Color.BLACK);

        button.addActionListener(null);

    }

    public JButton geButton(){
        return button;
    }

}
