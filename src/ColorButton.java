import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorButton {
    private JButton button;
    private int rgbValue;


    public ColorButton(ColorPanel panel, Color color, String name, Rgb rgb) {
        this.rgbValue = 0; 

        button = new JButton(name);
        button.setPreferredSize(new Dimension(100, 60));
        button.setBackground(color);
        button.setForeground(Color.BLACK);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //REmove system outs TODO
                System.out.println("Button clicked, rgbValue: " + rgb.getRgb(name));
                if(rgbValue + 5 > 255){
                    //Turn it to messeage pop TODO
                    System.out.println("Can't increase color " + name);
                    return;
                }
                rgbValue += 5;
                rgb.setRgb(name, rgbValue);
                panel.changeColor(new Color(rgb.getRgb("red"), rgb.getRgb("green"), rgb.getRgb("blue"))); // Call the changeColor method of the associated panel
            }
        });
    }

    public JButton getButton() {
        return button;
    }

}
