import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target t1 = new Target(100, 250, 100);
        t1.draw(g2);
    }
}
