package guiapp;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dave John Cole
 */
public class GuiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Simple Frame");
	      
	      frame.setSize(400, 400);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton startButton = new JButton("Press Me");
        
	      frame.add(startButton);
	      
	      frame.setVisible(true);
    }

}
