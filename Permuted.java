import java.util.*;
class Permuted {
 static final int NOOFCHAR=256;
 static void check(String word1,String word2)
 {
   char letters1[]=new char[NOOFCHAR];
   char letters2[]=new char[NOOFCHAR];
   if(word1.length()!=word2.length())
   {
      System.out.println("both are not permuted to each other");
      return;
   }
   for(int i=0;i<word1.length();i++)
   {
       letters1[word1.charAt(i)]++;
       letters2[word2.charAt(i)]++;
   }
   for(int i=0;i<NOOFCHAR;i++)
   {
     if(letters1[i]!=letters2[i])
     {
       System.out.println("both are not permuted to each other");
       return;
     }
   }
   System.out.println("both are permuted to each other");
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter string1:");
   String word1=sc.nextLine();
   System.out.println("Enter string2:");
   String word2=sc.nextLine();
   check(word1,word2);
  
 }
}
