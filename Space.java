import java.util.*;
class Space
{
  static char[] replaceSpaces(char[] letter)
  {
    int spaceCount = 0, currLength = 0;
    for (currLength = 0; currLength < letter.length; currLength++)
      if (letter[currLength] == ' ')
        spaceCount++;
    while (letter[currLength - 1] == ' ')
    {
      spaceCount--;
      currLength--;
    }
    int newLength = currLength + spaceCount * 2;
   System.out.println(currLength);
    int index = 0;
    char[] newLetters=new char[newLength];
    for (int j = 0; j < currLength; j++)
    {
 
      if (letter[j] == ' ')
      {
        newLetters[index] = '%';
        newLetters[index + 1] = '2';
        newLetters[index + 2] = '0';
        index = index + 3;
      }
      else
      {
        newLetters[index] = letter[j];
        index++;
      }
    }
    return newLetters;
  }
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter sentence");
    char[] sentence = sc.nextLine().toCharArray();
    sentence = replaceSpaces(sentence);
   System.out.println("result");
    for (int i = 0; i < sentence.length; i++)
      System.out.print(sentence[i]);
  }
}
