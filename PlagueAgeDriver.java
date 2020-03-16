import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javafx.scene.media.*;
import javafx.embed.swing.JFXPanel;

public class PlagueAgeDriver implements ActionListener {
  JMenuBar menuBar;
  JMenu menu1, menu2,subMenu;
  JMenuItem menuItem, menuItem2, menuItem3, menuItem4, menuItem5;
  
  JFXPanel fxPanel = new JFXPanel ();
  private MediaPlayer mPlayer = new MediaPlayer (new Media (new File ("SUSPENSE MUSIC - Sneak.mp3").toURI().toString()));
  private MediaPlayer mPlayer2 = new MediaPlayer (new Media (new File ("Suspense Music - Project Phoenix.mp3").toURI().toString()));
  private  MediaPlayer mPlayerLevelOne = new MediaPlayer (new Media (new File ("Suspense Music - Seeking The Truth.mp3").toURI().toString()));
  private  MediaPlayer mPlayerLevelTwo = new MediaPlayer (new Media (new File ("Megalovania2.mp3").toURI().toString())); //rthese are the MEDIA PLAYERS NEEDED, JUST MAKE A NEW ONE FOR NEW MP3, AND CALL THE MPLAYER.PLAY() AND MPLAYER/STOP() WHEERVER NEEDED
  private  MediaPlayer mPlayerCredits = new MediaPlayer (new Media (new File ("Megalovania2.mp3").toURI().toString()));
  
  
  JButton startS, next, next1, next2, next3, next4, next5,nextOG, enter; 
  JButton levelOne, levelTwo, levelThree, brief, menu;
  
  JFrame gameFrame;
  
  public PlagueAgeDriver () {
    gameFrame = new JFrame("Plague Age 8");
    
    gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //gameFrame.setLayout (null); DO NOT USE THIS, IT WILL GET RID OFIMAGE FOR SOME REASON
    //gameFrame.setResizable (false); DO NOT CHANGE
    gameFrame.setSize(1024,576);
    gameFrame.setVisible(true);
  }
  
  public void clearFrame ()
  {
    gameFrame.getContentPane().removeAll();
    gameFrame.repaint();
    gameFrame.revalidate();
  }
  public void addMainMenu () {
    mPlayer2.play();
    addBar();
    clearFrame();
    MainMenu m = new MainMenu ();
    m.addButtons ();
    gameFrame.add(m);
    gameFrame.revalidate (); 
    m.buttonPlay.addActionListener (this);
    m.buttonInstructions.addActionListener (this);
    m.buttonHighscores.addActionListener (this);
    m.buttonCredits.addActionListener (this);
    m.buttonExit.addActionListener (this);
  }
  
  public void actionPerformed (ActionEvent ae)
  {
    if (ae.getActionCommand ().equals ("Play Game")){
      mPlayer2.stop();
      addLevelOne ();
    } 
    else if (ae.getActionCommand (). equals ("Instructions")){
      addInstructions();
    }
    else if (ae.getActionCommand (). equals ("High Scores")){ //HIGHSCORES HERE
      addHighScores ();
    }
    else if (ae.getActionCommand (). equals ("Credits")){
      addCredits ();
    }
    else if (ae.getActionCommand (). equals ("Exit") || ae.getActionCommand (). equals ("Quit")){
      stopMusic();
      gameFrame.dispose();
      System.exit(0);
    }
    else if (ae.getActionCommand (). equals ("Overview")){
      addInstructions();
    }
    else if (ae.getActionCommand (). equals ("Level 1")){
      addInstructions1();
    }
    
    else if (ae.getActionCommand (). equals ("Return")){
      addMainMenu();
    }
    else if (ae.getActionCommand (). equals ("Description")){
      JOptionPane.showMessageDialog(null, "Plague Age 8 is an education game that is meant for individuals in grade 8 or higher. \n However, younger students will love this game just as much. Plague Age 8 tests \n students on their knowledge of Geography, Mathematics, and Cell Biology. Geography \nbeing easiest, and Cll Biology Being hardest. The objective of the player is to invade as \n many countries as they can. As for the scoring system, countries with larger populations \nare worth more points. The more points the player gains, the more individuals the player \n has infected.");
    }
    else if (ae.getActionCommand (). equals ("Controls")){
      JOptionPane.showMessageDialog(null, "All controls within this game use the mouse. There are no inputs from the keyboard \n needed, except for the username. Individual levels use mouses differently: \n Level 1 and 3 use buttons, level 3 uses JComboBox.");
    }
    else if (ae.getActionCommand (). equals ("Authors")){
      JOptionPane.showMessageDialog(null, "EduPlay is the company that created Plague Age 8. The leader of EduPlay is: Angela Wang. \nOther team members include: Shannon Oh and Zona Savic. \nReleased June 06, 2017.");
    }
    else if (ae.getActionCommand (). equals ("Start")){
      addStoryOneB();
    }
    else if (ae.getActionCommand (). equals ("Next:")){
      addStoryTwo();
    }
    else if (ae.getActionCommand (). equals ("Next")){
      addStoryThree();
    }
    else if (ae.getActionCommand (). equals ("Next ")){
      addStoryFour();
    }
    else if (ae.getActionCommand (). equals ("Next  ")){
      addStoryFive();
    }
    else if (ae.getActionCommand (). equals (" Next")){
      addStorySix();
    }
    else if (ae.getActionCommand (). equals ("  Next")){
      addStorySeven();
    }
    else if (ae.getActionCommand (). equals (" Next ")){
      addStoryEight();
    }
    else if (ae.getActionCommand (). equals ("Enter")){
      addMainMenu();
      mPlayer.stop();
    }
    else if (ae.getActionCommand (). equals ("Return to Main Menu")){
      stopMusic();
      mPlayerLevelOne.stop();
      addMainMenu();
    }
  }
  public void stopMusic()//PLS ADD UR MEDIA PLAYER FOR UR LEVEL.STOP() HERE
  {
    mPlayer2.stop();
    
    mPlayerLevelOne.stop();
    mPlayerLevelTwo.stop();
    mPlayerCredits.stop();
  }
  
  public void addCredits () {
    clearFrame ();
    mPlayer2.stop();
    Credits c = new Credits ();
    mPlayerCredits.play();
    gameFrame.add(c);
    gameFrame.validate (); 
    
    new java.util.Timer().schedule( 
                                   new java.util.TimerTask() {
      @Override
      public void run() {
        mPlayerCredits.play();
        gameFrame.remove (c);
        addMainMenu();
        gameFrame.repaint();
        gameFrame.revalidate();
      }
    }, 
                                   124000 
                                  );
  }
  
  public void addStoryOne()
  {
    mPlayer.play();
    
    StoryOne o = new StoryOne();
    startS = new JButton ("Start");
    startS.setBounds (890,490,90,30);
    startS.addActionListener (this);
    Font font = new Font("Minecraftia", 0 , 16);
    startS.setFont (font);
    
    o.add (startS);
    gameFrame.add (o);
    gameFrame.revalidate();
    gameFrame. repaint();
    JOptionPane.showMessageDialog(null, "Note: If you do not click on \"Done\" before clicking on \"Start\", you will have the default name: Random Disease.");
  }
  
  public void addStoryOneB()
  {
    nextOG = new JButton ("Next:");
    nextOG.setBounds (895,490,85,30);
    nextOG.addActionListener (this);
    clearFrame();
    Scene1  s = new Scene1 ();
    Font font = new Font("Minecraftia", 0 , 16);
    nextOG.setFont (font);
    s.add (nextOG);
    gameFrame.add (s);
    gameFrame.repaint();
    gameFrame.revalidate();
  }
  
  public void addStoryTwo()
  {
    next = new JButton ("Next");
    next.setBounds (900,490,80,30);
    next.addActionListener (this);
    clearFrame();
    Scene2 t = new Scene2 ();
    Font font = new Font("Minecraftia", 0 , 16);
    next.setFont (font);
    t.add (next);
    gameFrame.add (t);
    gameFrame.repaint();
    gameFrame.revalidate();
  }
  
  
  public void addStoryThree()
  {
    clearFrame();
    Scene3 th = new Scene3 ();
    gameFrame.add (th);
    gameFrame.repaint();
    gameFrame.revalidate();
    next1 = new JButton ("Next ");
    Font font = new Font("Minecraftia", 0 , 16);
    next1.setFont (font);
    next1.setBounds (895,490,90,30);
    next1.addActionListener (this);
    th.add (next1);
    gameFrame.repaint();
    gameFrame.revalidate();
  }
  
  public void addStoryFour ()
  {
    clearFrame();
    Scene4 th = new Scene4 ();
    gameFrame.add (th);
    gameFrame.repaint();
    gameFrame.revalidate();
    next2 = new JButton ("Next  ");
    Font font = new Font("Minecraftia", 0 , 16);
    next2.setFont (font);
    next2.setBounds (890,490,100,30);
    next2.addActionListener (this);
    th.add (next2);
  }
  
  public void addStoryFive ()
  {
    clearFrame();
    Scene5 th = new Scene5 ();
    gameFrame.add (th);
    gameFrame.repaint();
    gameFrame.revalidate();
    next3 = new JButton (" Next");
    Font font = new Font("Minecraftia", 0 , 16);
    next3.setFont (font);
    next3.setBounds (890,490,100,30);
    next3.addActionListener (this);
    th.add (next3);
    
  }
  
  public void addStorySix ()
  {
    clearFrame();
    Scene6 th = new Scene6 ();
    gameFrame.add (th);
    gameFrame.repaint();
    gameFrame.revalidate();
    next4 = new JButton ("  Next");
    Font font = new Font("Minecraftia", 0 , 16);
    next4.setFont (font);
    next4.setBounds (890,490,100,30);
    next4.addActionListener (this);
    th.add (next4);
    
  }
  
  public void addStorySeven ()
  {
    clearFrame();
    Scene7 th = new Scene7 ();
    gameFrame.add (th);
    gameFrame.repaint();
    gameFrame.revalidate();
    next5 = new JButton (" Next ");
    Font font = new Font("Minecraftia", 0 , 16);
    next5.setFont (font);
    next5.setBounds (890,490,100,30);
    next5.addActionListener (this);
    th.add (next5);
    
  }
  
  public void addStoryEight ()
  {
    clearFrame();
    Scene8 th = new Scene8 ();
    gameFrame.add (th);
    gameFrame.repaint();
    gameFrame.revalidate();
    enter = new JButton ("Enter");
    Font font = new Font("Minecraftia", 0 , 16);
    enter.setFont (font);
    enter.setBounds (890,490,100,30);
    enter.addActionListener (this);
    th.add (enter);
    
  }
  
  public void addBar ()
  {
    menuBar = new JMenuBar();
    menu1 = new JMenu("File");
    menuItem = new JMenuItem("Return to Main Menu");
    menuItem.addActionListener(this);
    menuItem2 = new JMenuItem("Quit");
    menuItem2.addActionListener(this);
    menu1.add(menuItem);
    menu1.add(menuItem2);
    menuBar.add(menu1);
    
    subMenu = new JMenu("Game");
    menu2 = new JMenu ("About");
    menuItem3 = new JMenuItem("Description");
    menuItem3.addActionListener(this);
    
    menuItem4 = new JMenuItem("Controls");
    menuItem4.addActionListener(this);
    
    menuItem5 = new JMenuItem("Authors");
    menuItem5.addActionListener(this);
    
    subMenu.add(menuItem4);
    subMenu.add(menuItem3);
    menu2.add(subMenu);
    menu2.add (menuItem5);
    
    menuBar.add(menu2);
    gameFrame.setJMenuBar(menuBar);
    
  }
  
  
  
  public void addHighScores (){ //DISPLAY THE STUPID HIGHSCORES IN THIS method
  }
  
  public void addLevelOne ()
  {
    clearFrame();
    stopMusic(); //ALL U GUYS HAVE TO CALL THIS
    LevelOneOpening oneScreen = new LevelOneOpening ();
    gameFrame.add (oneScreen);
    
    new java.util.Timer().schedule( 
                                   new java.util.TimerTask() {
      @Override
      public void run() {
        gameFrame.setSize (1034,640);
        gameFrame.remove (oneScreen);
        gameFrame.repaint();
        LevelOne levelOne = new LevelOne ();
        mPlayerLevelOne.play();
        clearFrame();
        levelOne.displayButtons();
        levelOne.readQuestions();
        levelOne.askQuestion ();
        
        levelOne.stuff.add(levelOne.questionNumber);
        levelOne.stuff.add(levelOne.questionText);
        gameFrame.add (levelOne.stuff);
        gameFrame.revalidate();
        gameFrame.repaint();
        
      }
    }, 
                                   2000 
                                  );
  }
  
  public void addLevelTwo () //MAKE SURE THERES A DELAY OR WHATER THAT GOES FROM LEVEL 1 TO 2, ALSO LEVEL 2 TO 3
  {
    //CALL THE STOPMETHOD FOR THE MEDIA PALYER THAT IS PLAYING THE PREVIOUS LEVELS MUSIC
//UR INSTANCE OF THE OPENING SCREEN FOR LEVEL 2 GOES AFTER THIS, UR MUSIC THEN FOLLOWS THAT
  }
  public void addLevelThree ()
  {
    //CALL THE STOPMETHOD FOR THE MEDIA PALYER THAT IS PLAYING THE PREVIOUS LEVELS MUSIC
    //UR INSTANCE OF THE OPENING SCREEN FOR LEVEL 2 GOES AFTER THIS, UR MUSIC THEN FOLLOWS THAT
  }
  
  public void addInstructions () //all ur instructions class needs to have 2 buttons, shannon u need 2 buttons, 1 to level 1 isntructions, 1 to level 3, zona u need 2: 1 to level 2 and 1 to mainMenu (just call addMainMEnu)
  {
    clearFrame ();
    
    BriefDescription b = new BriefDescription ();
    b.setLayout (null);
    levelOne = new JButton ("Level 1");
    levelOne.addActionListener (this);
    levelOne.setBounds (340,440,100,30);
    menu = new JButton ("Return");
    menu.setBounds (210,440,100,30);
    menu.addActionListener (this);
    b.add (levelOne);
    b.add (menu);
    gameFrame.add (b);
    gameFrame.revalidate();
  }
  public void addInstructions1 ()
  {
    clearFrame ();
    LevelOneInstructions lOne = new LevelOneInstructions();
    lOne.setLayout (null);
    brief = new JButton ("Level Two");
    brief.addActionListener (this);
    brief.setBounds (340,460,100,30);
    levelTwo = new JButton ("Overview");
    levelTwo.setBounds (210,460,100,30);
    levelTwo.addActionListener (this);
    lOne.add (brief);
    lOne.add (levelTwo);
    gameFrame.add (lOne);
    gameFrame.revalidate();
  }
  
  public static void main (String [] args)
  {
    PlagueAgeDriver game = new PlagueAgeDriver ();
    game.addStoryOne();
  } 
}
