import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

  public class StoryOne extends JPanel implements ActionListener{
 //  private boolean done = false;
  Image bacteria, ghost;
  BufferedImage box, scene1;
  private boolean next = false;
  JTextField v0TextField;
  String strV0TextBox;
  JButton begin;
  public StoryOne () {
          Player.person.setName (strV0TextBox);
          if (strV0TextBox == null)
          {
            Player.person.setName ("Random disease");
          }
    bacteria = Toolkit.getDefaultToolkit().createImage("bacteria.gif");
    ghost = Toolkit.getDefaultToolkit().createImage("Spookygif.gif");
    begin = new JButton ("Done");
    begin.setBounds (620,380,100,40);
     Font font = new Font("Minecraftia", Font.BOLD, 18);
     begin.setFont (font);
     begin.addActionListener (this);
    add (begin);
    v0TextField = new JTextField ("Enter disease name:");
    v0TextField.setBounds (400,380,200,40);
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
v0TextField.setFont (font1);
    add (v0TextField);
    revalidate();
    repaint();
    setLayout (null);
    try { 
      box = ImageIO.read(new File("dg-pixilart.png"));
    }
    catch (IOException e) { 
    }
    setSize(1024, 576);
    setVisible (true);
  }
  
  public boolean getNext ()
  {
    return next;
  }
  
  public void actionPerformed (ActionEvent ae)
  {
    if (ae.getActionCommand ().equals ("Done"))
    {
      strV0TextBox = v0TextField.getText();
      if (strV0TextBox.length() > 15)
      {
        JOptionPane.showMessageDialog(null, "Enter a valid name");
      }
      else
      {
        Player.person.setName (strV0TextBox);
        begin.setEnabled (false); //dfgdfg
      //  next = true;
    //    if (next ==true)
      //  {
     //     removeAll();
      //    Scene1  s = new Scene1 ();
      //    done =true;
       //   add (s);
       //   revalidate();
        //  repaint();
      //  }
      }
    }
  }
  public void paintComponent(Graphics g) //draw onto the panel
  {
    super.paintComponent(g); 
    g.drawImage(bacteria, 0, 0, 1024, 576, this);
    g.drawImage(box, 100,75, 800, 400, this);
    g.drawImage(ghost, 100,75, 170, 200, this);
    
  }
  
}