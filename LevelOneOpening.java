import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

public class LevelOneOpening extends JPanel {
  public  BufferedImage screen ;
  public LevelOneOpening () {
    try { 
      screen = ImageIO.read(new File("LevelOneOpening.png"));
    }
    catch (IOException e) { 
    }
    setSize(1024, 574);
      setVisible (true);
  }
  
  public void paintComponent(Graphics g) //draw onto the panel
  {
    super.paintComponent(g); 
    g.drawImage(screen, 0, 0, 1010, 540, this);
  }
}
//  public static void main (String[]args)
 // {
 //   LevelOneOpening stuff = new LevelOneOpening ();
    
  //  JFrame frame = new JFrame ("random screen");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(1024,574);
  //  frame.add (stuff);
 //   frame.setVisible(true);
 // }
//}