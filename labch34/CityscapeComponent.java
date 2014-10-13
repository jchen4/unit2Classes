import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.util.Random;

/**
 * instances classes and draws the objects in the graphics window.
 * 
 * @author @Jchen
 * @version 10/1
 */
public class CityscapeComponent extends JComponent
{
    /**
     * instances moon, building, sky and crudebird classes and draws them on the graphics window
     * 
     * @param   g   Graphics object
     * 
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
   
        
        Moon moon = new Moon(20, 200, 50);

        Building building = new Building(10, 100);
        Building building1 = new Building(5, 250);
        Building building2= new Building(8, 400);
        Building building3= new Building(6, 550);
        Sky sky = new Sky();
        Crudebird brid = new Crudebird(300, 50, 20);
        
        sky.draw(g2);
        moon.draw(g2);
        building.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        brid.draw(g2);
    }
}
