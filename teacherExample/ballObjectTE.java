/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ballobjectte;

import java.awt.BorderLayout;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JApplet;

/**
 *
 * @author Teacher
 */
public class BallObjectTE extends JApplet {

    /**
     * @param args the command line arguments
     */
    
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    
    private PaintSurface canvas;
    
   
    

    public void init () {
       this.setSize(WIDTH,HEIGHT);
       canvas = new PaintSurface();
       this.add(canvas, BorderLayout.CENTER);
       ScheduledThreadPoolExecutor executor =
               new ScheduledThreadPoolExecutor(3);
       executor.scheduleAtFixedRate(
               new AnimationThread(this),
               0L,30L,TimeUnit.MILLISECONDS);
    }
}
