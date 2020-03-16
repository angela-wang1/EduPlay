import java.awt.*;
import javax.swing.*;
import java.io.*;

public class SplashScreen
{
  public static JFrame mainFrame = new JFrame ("Plague Age 8");
  
  
  public SplashScreen ()
  {
    mainFrame.setSize (1024, 576);
  //  mainFrame.add (new Drawing ());
    mainFrame.setVisible (true);
  }
  
  //class Drawing extends JComponent 
  //{
  JPanel splashScreenPanel = new JPanel ();
    public void paintComponent (Graphics g)
    {
     // g.drawImage(imgL1, 0, 0, null); 
      
      Font titleFont = new Font ("Courier", Font.BOLD, 60);
      Color sea = new Color (67, 105, 222);
      Color sky = new Color (169, 226, 235);
      
      g.setColor (sea);
      g.fillRect (0, 300, 1024, 576);
      g.setColor (sky);
      g.fillRect (0, 0, 1024, 300);
      g.setColor (Color.black);
      g.setFont (titleFont);
      g.drawString ("Plague Age 8", 180, 40);
      
//      try {
//        }
//      catch (Exception e) {}
      //}
    }
  }

