import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class TargetComponent extends JComponent
{
    private double xCoo;
    private double yCoo;
    private double cRadius;
    public TargetComponent(double xc, double yc, double rad)
    {
        this.xCoo = xc;
        this.yCoo = yc;
        this.cRadius = rad;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target t1 = new Target(this.xCoo, this.yCoo, this.cRadius);
        t1.draw(g2);
    }
}
