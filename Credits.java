import java.awt.*;
import java.io.*;
import javax.swing.*;
import javafx.scene.media.*;
import javafx.embed.swing.JFXPanel;

public class Credits extends JPanel {
  int x = 0, y = 580;
  Image image, image2, image3, image4, image5, image6;
//  private MediaPlayer mPlayer;
  public Credits ()
  {
   // JFXPanel fxPanel = new JFXPanel ();
  //  mPlayer = new MediaPlayer (new Media (new File ("Megalovania2.mp3").toURI().toString()));
    image = Toolkit.getDefaultToolkit().createImage("A-Row-of-Dancing-Skeletons.gif");
    image2 = Toolkit.getDefaultToolkit().createImage("A-Row-of-Dancing-Skeletons.gif");
    image3 =   Toolkit.getDefaultToolkit().createImage("A-Row-of-Dancing-Skeletons.gif");
    image4 =  Toolkit.getDefaultToolkit().createImage("A-Row-of-Dancing-Skeletons.gif");
    image5 =  Toolkit.getDefaultToolkit().createImage("A-Row-of-Dancing-Skeletons.gif");
    image6 =  Toolkit.getDefaultToolkit().createImage("A-Row-of-Dancing-Skeletons.gif");
  }
  
  public void paint(Graphics g)
  {
 //   mPlayer.play();
    super.paint(g);
    
    if (image != null) {
      g.drawImage(image, -100, 0, this);
      g.drawImage(image2, -100, 200, this);
      g.drawImage(image3, -100, 400, this);
      g.drawImage(image4, 774, 0, this);
      g.drawImage(image5, 774, 200, this);
      g.drawImage(image6, 774, 400, this);
    }

    setBackground(Color.BLACK);
    Font font = new Font("Minecraftia",Font.PLAIN,40);
    g.setFont(font);
    g.setColor(Color.red);
    g.drawString("Credits: ",x,y);
    font = new Font("Minecraftia",Font.PLAIN,18);
    g.setFont(font);
    g.drawString("Company: EduPlay",x,y+100);
    g.drawString("Game: Plague Age 8",x,y+130);
    g.drawString("Producer ......................................... Angela Wang",x,y+210);
    g.drawString("Producer ............................................ Zona Savic",x,y+250);
    g.drawString("Producer ........................................... Shannon Oh",x,y+290);
    g.drawString("Designer .......................................... Angela Wang",x,y+370);
    g.drawString("Designer ............................................ Zona Savic",x,y+410);
    g.drawString("Designer ........................................... Shannon Oh",x,y+450);
    g.drawString("Artist .................................................. Angela Wang",x,y+530);
    g.drawString("Artist .................................................... Zona Savic",x,y+570);
    g.drawString("Artist ................................................... Shannon Oh",x,y+610);
    g.drawString("Programmer .................................... Angela Wang",x,y+690);
    g.drawString("Programmer ...................................... Zona Savic",x,y+730);
    g.drawString("Programmer .................................... Shannon Oh",x,y+770);
    g.drawString("Soundtracks ......................................... Toby Fox",x,y+850);
    g.drawString("Backgrounds .................................. Angela Wang",x,y+930);
    g.drawString("Backgrounds .................................... Zona Savic",x,y+970);
    g.drawString("Backgrounds ................................... Shannon Oh",x,y+1010);
    g.drawString("Beta Testers ................................. Angela Wang",x,y+1090);
    g.drawString("Beta Testers .............................. ... Zona Savic",x,y+1130);
    g.drawString("Beta Testers .................................. Shannon Oh",x,y+1170);
    g.drawString("Released: June 06 2017",x,y+ 1250);
    g.drawString("Special thank you to Ms. Krasteva for",x,y+ 1330);
    g.drawString("putting up with 3 class of AP ICS",x,y+ 1370);
    g.drawString("students for a whole semester and",x,y+ 1410);
    g.drawString("guiding us past the AP exams.",x,y+ 1450);
    g.drawString("Zona wants to give a special thank",x,y+ 1530);
    g.drawString("you to her ICS God: Jeffrey",x,y + 1570);
    g.drawString("FIN",x,y+ 1650);
    
    try{Thread.sleep(50);}catch(Exception ex){}
    x= 280;
    y-=1;
    if(y>this.getWidth ())
    {
      y=0;
    } 
    repaint();
  }
}
