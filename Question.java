public class Question
{
  private int answerButton;
  private String question;
  private String answer;
  
  public Question (int num, String q, String a)
  {
    answerButton = num;
    question = q;
    answer = a;
  }
  
  public int getAnswerButton ()
  {
    return answerButton;
  }
  public String getQuestion ()
  {
    return question;
  }
  public String getAnswer()
  {
    return answer;
  } 
}