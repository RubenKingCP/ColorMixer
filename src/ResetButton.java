import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ResetButton {
    private JButton button;

    public ResetButton(Rgb rgb, ColorPanel panel){
        button = new JButton();
        button.setPreferredSize(new Dimension(40, 40));
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                rgb.reset();
                panel.changeColor(Color.WHITE);
            }
        });
    }

    public JButton getButton(){
        return button;
    }
}
