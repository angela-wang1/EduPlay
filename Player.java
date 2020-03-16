import java.util.ArrayList;
import java.awt.*;
public class Player {
  public static Player person = new Player ();
  private String name;
  private ArrayList<String> countries = new ArrayList<String>();
  
  public Player ()
  {
  }
  
  public void setName (String n)
  {
    name = n;
  }
  
  public String getName ()
  {
    return name;
  }
  
  public void addCountry (String name)
  {
    countries.add (name);
  }
  
  public ArrayList<String> getCountries ()
  {
    return countries;
  } 
}