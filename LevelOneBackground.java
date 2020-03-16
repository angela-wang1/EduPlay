import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

public class LevelOneBackground extends JPanel {
  public  BufferedImage map ;
   Color maroonRed = new Color (138,5,5);
  public LevelOneBackground () {
    try { 
      map = ImageIO.read(new File("world-map.png"));
    }
    catch (IOException e) { 
    }
    setSize(1024, 576);
      setVisible (true);
  }
  
  public void paintComponent(Graphics g) //draw onto the panel
  {
    super.paintComponent(g); 
    g.drawImage(map, 0, 0, 1024, 576, this);
    g.fillRect (30,40,800,75);
    g.setColor (maroonRed);
        g.fillRect (35,45,790,65);
  }
}