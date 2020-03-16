import java.awt.*;
import java.io.*;
public class LevelsWithQuestions
{
  private final int NUMBER_OF_QUESTIONS = 20;
  private Question[] questions = new Question [NUMBER_OF_QUESTIONS];
  
  public LevelsWithQuestions (String fileName)
  {
    try
    {
      BufferedReader b = new BufferedReader (new FileReader(fileName));
      for (int x = 0 ; x < 20 ; x++)
      {
        String askQuestion = b.readLine();
        String answer = b.readLine();
        int button = Integer.parseInt (b.readLine ());
        questions[x] = new Question (button, askQuestion, answer);
      }
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      //Code that tells user that there was an error loading the questions, check the Questions file
    }
    catch ( IOException e2) {}
    
    // questions = new Question [NUMBER_OF_QUESTIONS];
  }
  
  /*
  public void assignQuestions (String fileName)
  {
    try
    {
      BufferedReader b = new BufferedReader (new FileReader(fileName));
      for (int x = 0 ; x < 20 ; x++)
      {
        String askQuestion = b.readLine();
        String answer = b.readLine();
        questions[x] = new Question (askQuestion, new Answer(answer));
      }
    }
    
    catch (ArrayIndexOutOfBoundsException e)
    {
      //Code that tells user that there was an error loading the questions, check the Questions file
    }
    catch ( IOException e2) {}
  }
  
  */
    public Question[] getQuestions () {
    return questions;
    }
}