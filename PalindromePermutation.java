import java.util.*;
class PalindromePermutation
{
 static final int NOOFCHAR=256;
  static void  check(String word)
  {
   int letter[]= new int[NOOFCHAR];
   for(int i=0;i<word.length();i++)
   {
     letter[word.charAt(i)]++;
   }
   int odd=0;
   for(int i=0;i<256;i++)
   {
     if(letter[i]%2==1)
       odd+=1;
   }
   if(((word.length())%2==0 && odd>0) || odd>1)
   {
     System.out.println("palindrome permutation not possible");
     return;
   }
   System.out.println("palindrome permutation possible");
  }
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter word");
    String word = sc.nextLine();
    check(word); 
  }
