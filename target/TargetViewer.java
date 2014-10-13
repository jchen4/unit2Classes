import javax.swing.JFrame;
public class TargetViewer
{
    public static void view(double xCo, double yCo, double vRadius)
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent(xCo, yCo, vRadius);
        frame.add(component);
        
        frame.setVisible(true);
    }
}















































