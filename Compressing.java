import java.util.*;
class Compressing {
 static void compress(String word)
 {
   int count=1,wordLength=word.length();
   String result="";
   for(int i=1;i<wordLength;i++)
   {
     if(word.charAt(i-1)==word.charAt(i))
     {
       count++;
     }
     else
     {
       result+=word.charAt(i-1);
       result+=(char)(count+'0');
       count=1;
     }
   }
   result+=word.charAt(wordLength-1);
   result+=(char)(count+'0');
   if(result.length()>word.length())
     System.out.println(word);
   else
     System.out.println(result);
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter string:");
   String word=sc.nextLine();
   compress(word);
 }
}
