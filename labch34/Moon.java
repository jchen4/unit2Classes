import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;


/**
 * moon class that generates a moon based on size and phase
 * 
 * @author jchen
 * @version 10/7/2014
 */
public class Moon
{
    /**phase as a number (0 = no moon, >50 = full moon/sun)*/
    private double phase;
    /**center of moon x axis*/
    private int centerX;
    /**center of moon Y axis*/
    private int centerY;
    /**
     * constructor that specifies phase and center coords of moon
     */
    public Moon(double type, int centX, int centY)
    {
        this.phase = type;
        this.centerX = centX;
        this.centerY = centY;
        
    }
    /**
     * draws the moon and the moon shadow that covers part of the moon to act as a phase
     * 
     * @param   g2  Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double mun = new Ellipse2D.Double(this.centerX, this.centerY, 50, 50);
        Ellipse2D.Double munShadow = new Ellipse2D.Double(this.centerX + this.phase, this.centerY, 50, 50);
        
        if (this.phase > 50)
        {
            g2.setColor(Color.YELLOW);
            g2.fill(mun);
        }
        else
        {
            g2.setColor(Color.white);
            g2.fill(mun);
        }
        
        g2.setColor(Color.CYAN);
        g2.fill(munShadow);
    }
}