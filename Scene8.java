import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

public class Scene8 extends JPanel {
  public  BufferedImage scene ;
  public Scene8 () {
    try { 
      scene = ImageIO.read(new File("scene8.png"));
    }
    catch (IOException e) { 
    }
        setLayout (null);
    setSize(1024, 576);
      setVisible (true);
  }
  
  public void paintComponent(Graphics g) //draw onto the panel
  {
    super.paintComponent(g); 
    g.drawImage(scene, 0, 0, 1008, 540, this);
  }
}