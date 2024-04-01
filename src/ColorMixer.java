import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ColorMixer{
    private static JFrame frame;
    private static JPanel panel;



    public static void main(String[] args) {
        //Make Frame
        frame = new JFrame("ColorMixer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        panel = new ColorPanel().getPanel();

        //Make panel
        frame.getContentPane().add(panel, BorderLayout.SOUTH);        




        //Customize
        frame.setPreferredSize(new Dimension(1000, 1000)); 
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.pack();
        frame.setVisible(true);  
    }
    
}