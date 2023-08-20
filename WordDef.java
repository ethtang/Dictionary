public class WordDef
{
  private String word;
  private String definition;

  public WordDef(String theWord, String theDef)
  {
    word = theWord;
    definition = theDef;
  }

  public String getWord()
  {
    return word;
  }

  public String getDefinition()
  {
    return definition;
  }

  public void setWord(String w)
  {
    word = w;
  }

  public void setDefinition(String d)
  {
    definition = d;
  }
}