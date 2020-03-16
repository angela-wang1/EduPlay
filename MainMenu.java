import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JPanel /*implements ActionListener*/{
//variable that determines if level can be choosen
  public JButton buttonPlay;
  public JButton buttonCredits;
  public JButton buttonHighscores;
  public JButton buttonInstructions; 
  public JButton buttonExit;
  public  BufferedImage image ;
  public MainMenu ()
  {
    try { 
      image = ImageIO.read(new File("MainMenu.png"));
    }
    catch (IOException e) { 
    }
  }
  
  public void addButtons ()
  {
    buttonPlay = new JButton ("Play Game");


     buttonInstructions = new JButton ("Instructions");
     buttonHighscores = new JButton ("High Scores");
     buttonCredits = new JButton ("Credits");
     buttonExit = new JButton ("Exit");
    setLayout(null);
    buttonPlay.setBounds(430,210,150,30);


    buttonInstructions.setBounds(430,260,150,30);
    buttonHighscores.setBounds(430,310,150,30);
    buttonCredits.setBounds(430,360,150,30);
    buttonExit.setBounds(430,410,150,30);
    

    
    add(buttonPlay); //invisible reference to the panel since mainmenu extends JPanel


    add(buttonInstructions);
    add(buttonHighscores);
    add(buttonCredits);
    add(buttonExit);
    
    setSize(1024, 576); //setting size of JPanel
    setVisible(true); //setting Panel as visible 
    
   /* 
    buttonPlay.addActionListener (this);
    buttonChoose.addActionListener (this);
    buttonLearn.addActionListener (this);
    buttonInstructions.addActionListener (this);
    buttonHighscores.addActionListener (this);
    buttonCredits.addActionListener (this);
    buttonExit.addActionListener (this);
    */
    
  }
  
  /*
   public void actionPerformed (ActionEvent ae)
  {
    if (ae.getActionCommand ().equals ("Play Game")){
      System.out.println ("Make an instance of the level 1 class");
    } 
    else if (ae.getActionCommand (). equals ("Choose Level")){
      System.out.println ("Make an instance of the choose level panel");
    }
    else if (ae.getActionCommand (). equals ("Learn")){
      System.out.println ("Make an instance of the learn class");
    }
    else if (ae.getActionCommand (). equals ("Instructions")){
      System.out.println ("Make an instance of the instructions panel");
    }
    else if (ae.getActionCommand (). equals ("High Scores")){
      System.out.println ("Make an instance of high scores");
    }
    else if (ae.getActionCommand (). equals ("Credits")){
      System.out.println ("Make an instance of the credits class");
    }
    else if (ae.getActionCommand (). equals ("Exit")){
      System.out.println ("Make an instance of the exit class");
    }
  }
  */
  public void paintComponent(Graphics g) {
    //super.paintComponent(g); 
    g.drawImage(image, 0, 0, 1024, 576, this);
  }
}
