import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;


/**
 * creates black bird with an eye
 * 
 * @author jchen
 * @version 10/7/2014
 */
public class Crudebird
{
    /**center of bird x value*/
    private int centerX;
    /**center of bird y value*/
    private int centerY;
    /**size of bird as a integer*/
    private int size;
    /**
     * constructor that specifies bird center coords and its size
     */
    public Crudebird(int x, int y, int s)
    {
        this.centerX = x;
        this.centerY = y;
        this.size = s;
    }
    /**
     * draws the bird and its eye bassed on size and center coords
     * 
     * @param    g2     Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double brid = new Ellipse2D.Double(this.centerX, this.centerY, this.size+ (this.size/2), this.size);
        Ellipse2D.Double eye = new Ellipse2D.Double( this.centerX + 5, this.centerY, 5, 5);
        
        g2.setColor(Color.BLACK);
        g2.fill(brid);
        g2.setColor(Color.WHITE);
        g2.fill(eye);        
        
    }
}