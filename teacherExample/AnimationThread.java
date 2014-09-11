/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ballobjectte;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;

/**
 *
 * @author Teacher
 */
public class AnimationThread implements Runnable {

    JApplet c;

    
    public AnimationThread(JApplet c) {
        this.c = c;
    }
    
    public void run () {
        c.repaint();   
    }
    
    
    
}
