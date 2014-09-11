/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ballobjectte;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Teacher
 */
public class PaintSurface extends JComponent {

    //creates an Array to store the ball objects
    public ArrayList<Ball> balls = new ArrayList<Ball>();
    //boolean so when we click things start
    public boolean start = false;
    
    public PaintSurface () {
        
        //create 10 balls (i<10) in the Array with a diameter of 20
        for (int i=0;i<10;i++) {
            balls.add(new Ball(20));
        }
        //Add a mouse listener
        addMouseListener ( new MouseAdapter() {
            public void mousePressed (MouseEvent e) {
                if (e.getButton() == 1) {
                    start = true;
                }
            }   
        }
        );
    }

    @Override
    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        //add antialiasing, makes the adges smoother
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        //set the color you want to draw in
        g2.setColor(Color.RED);
        
        
        if (start) {
            //draw each ball we created in the array
            for (Ball ball : balls) {
                //make the ball grow
                ball.grow(Math.random());
                //draw the ball
                g2.fill(ball);
            }
        }
        
        
        
    }
    
}
