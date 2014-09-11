/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ballobjectte;

import java.awt.geom.Ellipse2D;

/**
 *
 * @author Teacher
 */
public class Ball extends Ellipse2D.Float {
    
    int x_pos;
    int y_pos;
    
    
    public Ball (int diameter) {
        //calls super which is Ellipse2D and sets up out circle
        super (
                (int)(Math.random() * 500), //random x position between 0-500
                (int)(Math.random() * 500), //random y position between 0-500
                diameter,diameter); //diameter is set in PaintSurface for now
        
    }
    
    public void grow (double rate) {
        this.width += rate;
        this.height += rate;
    }
     
    
    
    
}
