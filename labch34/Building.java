import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Building class that generates a building based on the top left corner coords and number of floors. random 
 * windows are also created.
 * 
 * @author @Jchen
 * @version 10/1/2014
 */
public class Building
{
    /**x value of buildings top left corner*/
    private int bottomPos;
    /**y value of buildings top left y coord*/
    private int leftPos;
    /**number of floors in the building*/
    private int numFloors;
    /**
     * constructor that specifies floors and the x value of the top left of the building
     * 
     */
    public Building(int floors, int x)
    {
        this.numFloors = floors;
        this.bottomPos = x;
        this.leftPos = 600 - (floors*50);
    }
    
    /**
     * draws building with random windows lit up
     * 
     * @param   g2      Graphics2D object
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(this.bottomPos, this.leftPos, 100, this.numFloors * 50);
        int ctr = 0;
        g2.setColor(Color.GRAY);
        g2.fill(building);
        Random randum = new Random();
        while (ctr < this.numFloors)
        {
            Rectangle window = new Rectangle(this.bottomPos + 20, this.leftPos + 20, 20, 20);
            Rectangle window2 = new Rectangle(this.bottomPos + 60, this.leftPos + 20, 20, 20);
            int lights = randum.nextInt(2);
            if (lights == 1)
            {
                g2.setColor(Color.WHITE);
                g2.fill(window);
            }
            if (lights == 0)
            {
                g2.setColor(Color.YELLOW);
                g2.fill(window);
            }
            lights = randum.nextInt(2);
            if (lights == 1)
            {
                g2.setColor(Color.WHITE);
                g2.fill(window2);
            }
            if (lights == 0)
            {
                g2.setColor(Color.YELLOW);
                g2.fill(window2);
            }
            this.leftPos = this.leftPos + 40;
            ctr = ctr + 1;
        }
    }
}
