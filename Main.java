import java.util.Scanner;
import java.util.ArrayList;
public class Main 
{
  public static void main(String[] args) 
  {
    Scanner stringInput = new Scanner(System.in);
    Scanner intInput = new Scanner(System.in);
    ArrayList<WordDef> dictionary = new ArrayList<WordDef>();
    boolean repeat = true;
    
    System.out.println("1. Add a new word and its definition to the dictionary.");
    System.out.println("2. Remove a word and its definition from the dictionary.");
    System.out.println("3. Change a definition to a word in the dictionary.");
    System.out.println("4. Get the definition of a word, or be informed that the word is not in the dictionary.");
    System.out.println("5. Display all the words in the dictionary and the total count of words in the dictionary.");
    System.out.println("6. Quit");

    while (repeat)
    {
      System.out.print("Enter a menu number: ");
      int selection = intInput.nextInt();

      if (selection == 1)
      {
        System.out.print("Enter a word: ");
        String w = stringInput.nextLine();

        System.out.print("Enter its definition: ");
        String d = stringInput.nextLine();

        WordDef newWord = new WordDef(w, d);
        dictionary.add(newWord);
      }

      if (selection == 2)
      {
        System.out.print("Enter a word: ");
        String w = stringInput.nextLine();

        boolean print = true;
        
        for (int i = dictionary.size()-1; i >= 0; i--)
        {
          if (dictionary.get(i).getWord().equals(w))
          {
            dictionary.remove(i);
            System.out.println("Word removed");
            print = false;
            
            if (dictionary.size() < 1)
            {
              break;
            }
          }
          
          if (i == 0 && dictionary.get(i).getWord().equals(w) == false)
          {
            if (print)
            {
              System.out.println("Word not in dictionary");
            }
            break;
          }
        }

        if (dictionary.size() < 1)
        {
          System.out.println("Dictionary is empty");
        }
      }

      if (selection == 3)
      {
        System.out.print("Enter a word: ");
        String w = stringInput.nextLine();
        
        for (int i = dictionary.size()-1; i >= 0; i--)
        {
          if (dictionary.get(i).getWord().equals(w))
          {
            System.out.print("Enter a definition: ");
            String d = stringInput.nextLine();
            dictionary.get(i).setDefinition(d);
            System.out.println("Definition changed");
            break;
          }

          if (i == 0 && dictionary.get(i).getWord().equals(w) == false)
          {
            System.out.println("Word not in dictionary");
            break;
          }
        }

        if (dictionary.size() < 1)
        {
          System.out.println("Dictionary is empty");
        }
      }

      if (selection == 4)
      {
        System.out.print("Enter a word: ");
        String w = stringInput.nextLine();
        
        for (int i = dictionary.size()-1; i >= 0; i--)
        {
          if (dictionary.get(i).getWord().equals(w))
          {
            System.out.println(dictionary.get(i).getDefinition());
            break;
          }

          if (i == 0 && dictionary.get(i).getWord().equals(w) == false)
          {
            System.out.println("Word not in dictionary");
            break;
          }
        }

        if (dictionary.size() < 1)
        {
          System.out.println("Dictionary is empty");
        }
      }

      if (selection == 5)
      {
        for (int i = 0; i < dictionary.size(); i++)
        {
          System.out.println(dictionary.get(i).getWord());
        }
        System.out.println("word count: " + dictionary.size());
      }

      if (selection == 6)
      {
        break;
      }
    }
  }
}
