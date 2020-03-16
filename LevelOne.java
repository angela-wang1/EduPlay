//qPwoeiruty285
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.event.*;

public class LevelOne/* extends LevelsWithQuestions*/  implements ActionListener 
{

  int listSpace =0;
  int questionIndex = 0; 
  JLabel invade;
  JLabel erase;
  JLabel questionText;
  JLabel questionNumber;
  private Question[] array = new Question [20]; 
  LevelOneBackground stuff = new LevelOneBackground ();
  
  JPanel screen = new JPanel ();
  public BufferedImage image;
  JButton canada, mexico, brazil, argentina, greenland, iceland, uk, france, spain, southAfrica, madagascar, russia, china, japan, india, australia, newZealand, antartica,peru,chile;
 
  public LevelOne ()
  {    

    
  }
  
  public void displayButtons ()
  {
    stuff.setLayout(null);
    canada = new JButton ("1");
    canada.setBounds(150,180,42,20);
    stuff.add (canada);
    chile= new JButton ("2");
    chile.setBounds(195,460,42,20); 
    stuff.add (chile);
    mexico= new JButton ("3");
    mexico.setBounds(100,315,42,20);
    stuff.add (mexico);
    brazil = new JButton ("4");
    brazil.setBounds(320,410,42,20);
    stuff.add (brazil);
    argentina= new JButton ("5");
    argentina.setBounds(320,495,42,20);
    stuff.add (argentina);
    greenland = new JButton ("6");
    greenland.setBounds(320,160,42,20);
    stuff.add (greenland);
    iceland= new JButton ("7");
    iceland.setBounds(450,132,42,20);
    stuff.add (iceland);
    uk= new JButton ("8");
    uk.setBounds(340,188,42,20);
    stuff.add (uk);
    france = new JButton ("9");
    france.setBounds(360,240,42,20);
    stuff.add (france);
    spain = new JButton ("10");
    spain.setBounds(385,290,50,20);
    stuff.add (spain);
    southAfrica = new JButton ("11");
    southAfrica.setBounds(510,495,50,20);
    stuff.add (southAfrica);
    madagascar= new JButton ("12");
    madagascar.setBounds(650,420,50,20);
    stuff.add (madagascar);
    russia = new JButton ("13");
    russia.setBounds(730,145,50,20);
    stuff.add (russia);
    china= new JButton ("14");
    china.setBounds(765,280,50,20);
    stuff.add (china);
    japan = new JButton ("15");
    japan.setBounds(895,280,50,20);
    stuff.add (japan);
    india= new JButton ("16");
    india.setBounds(673,345,50,20);
    stuff.add (india);
    australia = new JButton ("17");
    australia.setBounds(830,460,50,20);
    stuff.add (australia);
    newZealand = new JButton ("18");
    newZealand.setBounds(850,530,50,20);
    stuff.add (newZealand);
    antartica = new JButton ("19");
    antartica.setBounds(570,545,50,20);
    stuff.add (antartica);
    peru = new JButton ("20");
    peru.setBounds(195,400,50,20);
    stuff.add (peru);
    
    canada.addActionListener (this);
    mexico.addActionListener (this);
    brazil.addActionListener (this);
    argentina.addActionListener (this);
    greenland.addActionListener (this);
    iceland.addActionListener (this);
    uk.addActionListener (this);
    france.addActionListener (this);
    spain.addActionListener (this);
    southAfrica.addActionListener (this);
    madagascar.addActionListener (this);
    russia.addActionListener (this);
    china.addActionListener (this);
    japan.addActionListener (this);
    india.addActionListener (this);
    australia.addActionListener (this);
    newZealand.addActionListener (this);
    antartica.addActionListener (this);
    peru.addActionListener (this);
    chile.addActionListener (this); 
  }
  
  
  public void readQuestions () 
  {
    LevelsWithQuestions l = new LevelsWithQuestions ("GeoQuestionsdoNotEdit.txt");
    array = l.getQuestions();
    shuffleArray(array);
  }
  
  public void askQuestion ()
  {
    displayQuestion (array[questionIndex].getQuestion(), questionIndex);
  }
  
  
  public void invade (String country, int space){     
    invade = new JLabel ("- " + country);
    invade.setFont(new Font("Calibri", Font.PLAIN, 12));
    invade.setForeground(Color.WHITE);
    invade.setBounds (20,space,100,20);
    stuff.add (invade);
    stuff.revalidate();
    stuff.repaint();
  }
  
   
//  public void actionPerformed (ActionEvent ae)
//  {
//    if (questionIndex == 12 && ae.getActionCommand ().equals ("1")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Canada");
//    } 
//    else if (questionIndex == 4 && ae.getActionCommand ().equals ("2")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Chile");
//    } 
//    else if (questionIndex == 10 && ae.getActionCommand ().equals ("3")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Mexico");
//      
//    } 
//    else if (questionIndex == 3 && ae.getActionCommand ().equals ("4")){   
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Brazil");
//    } 
//    else if (questionIndex == 16 && ae.getActionCommand ().equals ("5")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Argentina");
//    } 
//    else if (questionIndex == 8 && ae.getActionCommand ().equals ("6")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Greenland");
//    } 
//    else if (questionIndex == 13 && ae.getActionCommand ().equals ("7")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Iceland");
//    } 
//    else if (questionIndex == 11 && ae.getActionCommand ().equals ("8")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("United Kingdom");
//    } 
//    else if (questionIndex == 15 && ae.getActionCommand ().equals ("9")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("France");
//    } 
//    else if (questionIndex == 7 && ae.getActionCommand ().equals ("10")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Spain");
//    } 
//    else if (questionIndex == 14 && ae.getActionCommand ().equals ("11")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("South Africa");
//    } 
//    else if (questionIndex == 18 && ae.getActionCommand ().equals ("12")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Madagascar");
//    } 
//    else if (questionIndex == 0 && ae.getActionCommand ().equals ("13")){ //spcial else
//      
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Russia");
//     /*
//       try {
//       Thread.sleep (1000);
//       } 
//       catch (InterruptedException e) {
//       //Handle exception
//       }
//       
//       try {
//       BufferedImage erasePic = ImageIO.read(new File("correct.png"));
//       erase = new JLabel(new ImageIcon(erasePic));
//       erase.setBounds (450,230,205,142);
//       stuff.add(erase);
//       stuff.revalidate();
//       stuff.repaint();
//       } 
//       
//       catch (IOException e){
//       }
//       */
//    }
//    else if (questionIndex == 2 && ae.getActionCommand ().equals ("14")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("China");
//    } 
//    else if (questionIndex == 16 && ae.getActionCommand ().equals ("15")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Japan");
//    } 
//    else if (questionIndex == 6 && ae.getActionCommand ().equals ("16")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("India");
//    } 
//    else if (questionIndex == 5 && ae.getActionCommand ().equals ("17")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Australia");
//      
//    } 
//    else if (questionIndex == 19 && ae.getActionCommand ().equals ("18")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("New Zealand");
//    } 
//    else if (questionIndex == 9 && ae.getActionCommand ().equals ("19")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Antartica");
//      
//    } 
//    else if (questionIndex == 1 && ae.getActionCommand ().equals ("20")){
//      listSpace += 10;
//      invade (array [questionIndex].getAnswer(),360+listSpace);
//      c.addCountry ("Peru");
//    } 
//    
//    stuff.remove (questionText);
//    stuff.remove (questionNumber);
//    stuff.revalidate();
//    stuff.repaint();
//      questionIndex++;
//     if (questionIndex >= 20 ){
//       finish();
//     }
//     else {
//       askQuestion();
//     }
//  }
  
  public void actionPerformed (ActionEvent ae)
  {
    if (ae.getActionCommand ().equals ("" + (array [questionIndex].getAnswerButton ())))
    {
      if (array [questionIndex].getAnswer().equals ("Russia"))
      {
        invade (array [questionIndex].getAnswer(),360+listSpace);
      //  c.addCountry ("Russia");
        Player.person.addCountry ("Russia");
      }
      else 
      {
        listSpace += 10;
        invade (array [questionIndex].getAnswer(),360+listSpace);
//c.addCountry (array [questionIndex].getAnswer ());
        Player.person.addCountry (array [questionIndex].getAnswer ());
      }
    }
    stuff.remove (questionText);
    stuff.remove (questionNumber);
    stuff.revalidate();
    stuff.repaint();
    questionIndex++;
    if (questionIndex >= 20 ){
      finish();
    }
    else {
      askQuestion();
    }
  }
    
public void shuffleArray(Question[] array)
{
    int index;
    Question temp;
    Random random = new Random();
    for (int i = array.length - 1; i > 0; i--)
    {
        index = random.nextInt(i + 1);
        temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }
}
  
  public void displayQuestion (String text, int num) 
  {
    
    questionText = new JLabel (text);
    questionNumber = new JLabel ("Question " + (num+1));
    
    questionText.setFont(new Font("Minecraftia.ttf", Font.PLAIN, 14));
    questionText.setForeground(Color.WHITE);
    questionText.setBounds (50,80,790,20);
    questionNumber.setFont(new Font("Minecraftia.ttf", Font.PLAIN, 16));
    questionNumber.setForeground(Color.WHITE);
    questionNumber.setBounds (50,50,790,20);
    
    stuff.add(questionNumber);
    stuff.revalidate();
    stuff.repaint();
    stuff.add(questionText);
    stuff.revalidate();
    stuff.repaint();   
  }
  
  public void finish ()
  {
     canada.setEnabled (false);
    mexico.setEnabled (false);
    brazil.setEnabled (false);
    argentina.setEnabled (false);
    greenland.setEnabled (false);
    iceland.setEnabled (false);
    uk.setEnabled (false);
    france.setEnabled (false);
    spain.setEnabled (false);
    southAfrica.setEnabled (false);
    madagascar.setEnabled (false);
    russia.setEnabled (false);
    china.setEnabled (false);
    japan.setEnabled (false);
    india.setEnabled (false);
    australia.setEnabled (false);
    newZealand.setEnabled (false);
    antartica.setEnabled (false);
    peru.setEnabled (false);
    chile.setEnabled (false);
    JLabel finished = new JLabel (Player.person.getName() + ", You finished! Ready for the next level? HERE WE GO!");

    finished.setFont(new Font("Minecraftia.ttf", Font.PLAIN, 20));
    finished.setForeground(Color.WHITE);
    finished.setBounds (50,65,790,30);
    stuff.add (finished);
    stuff.revalidate ();
    stuff.repaint();

  }
  
  
  
//  public static void main (String[]args)
//  {
//    LevelOne levelOne = new LevelOne();
//    JFrame frame = new JFrame ("random screen");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(1024,610); //changed the height
//    frame.setResizable (false);
//    
//    levelOne.displayButtons();
//    levelOne.readQuestions();
//    
//    frame.add (levelOne.stuff);
//    frame.setVisible(true);
//    
//    levelOne.askQuestion ();   
//  }
  
} 
