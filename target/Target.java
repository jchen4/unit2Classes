import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target
{
    private double radius;
    
    private double xcoord;
    
    private double ycoord;
    
    private double ctr;
    public Target(double cRadius, double xc, double yc)
    {
        this.radius = cRadius;
        this.xcoord = xc;
        this.ycoord = yc;
        this.ctr = 1;
    }
    
    public void draw(Graphics2D g2)
    {        while (this.radius > 10)
        {
            Ellipse2D.Double outerCircle = new Ellipse2D.Double(this.xcoord, this.ycoord, this.radius, this.radius);
            this.radius = this.radius - 10;
            this.xcoord = this.xcoord + 5;
            this.ycoord = this.ycoord + 5;
            if (this.ctr == 1)
            {
                g2.draw(outerCircle);
                g2.setColor(Color.BLACK);
                g2.fill(outerCircle);
                this.ctr = 0.0;
            }
            else
            {
                g2.draw(outerCircle);
                g2.setColor(Color.WHITE);
                g2.fill(outerCircle);
                this.ctr = 1;
            }
        }
    }
    
}
