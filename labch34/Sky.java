import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;


/**
 * draws background for city
 * 
 * @author jchen
 * @version 9/12/2014
 */
public class Sky
{
    /**
     * draws a cyan rectangle as a background in the graphicds window
     * 
     * @param   g2  object of Graphgics2D
     */
    public void draw(Graphics2D g2)
    {
        Rectangle rect = new Rectangle(0, 0, 800, 600);
        
        g2.setColor(Color.CYAN);
        g2.fill(rect);
        
    }
}