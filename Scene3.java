import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

public class Scene3 extends JPanel {
  public  BufferedImage scene ;
  public Scene3 () {
    try { 
      scene = ImageIO.read(new File("scene3.png"));
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