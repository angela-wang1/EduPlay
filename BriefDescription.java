import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

public class BriefDescription extends JPanel {
  public  BufferedImage description ;
  Image image;
  public BriefDescription () {
    try { 
      description = ImageIO.read(new File("InstructionsBrief.png"));
          image = Toolkit.getDefaultToolkit().createImage("Moving-picture-skeleton-riding-bike-around-world-animated-gif.gif");
    }
    catch (IOException e) { 
    }
    setSize(1024, 574);
      setVisible (true);
  }
  
  public void paintComponent(Graphics g) //draw onto the panel
  {
    super.paintComponent(g); 
    g.drawImage(description, 0, 0, 1010, 540, this);
    if (image != null) {
      g.drawImage(image, 460, 200, 440, 300 , this);
    }
  }
}