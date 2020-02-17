import java.util.*;
class OneEdit {
 static void check(String sentance1,String sentance2)
 {
   if(sentance1.equals(sentance2))
   {
     System.out.println("no");
     return;
   }
   int length1=sentance1.length();
   int length2=sentance2.length();
   if(length1-length2>1 || length2-length1>1)
   {
     System.out.println("no");
     return;
   }
   int letter1=0,letter2=0,difference=0;
   while(letter1<length1 && letter2<length2)
   {
     if(sentance1.charAt(letter1)==sentance2.charAt(letter2))
     {
       letter1++;
       letter2++;
     }
     else if(length1<length2)
     {
       difference++;
       letter2++;
     }
     else if(length2>length1)
     {
       difference++;
       letter1++;
     }
     else
     {
       difference++;
       letter1++;
       letter2++;
     }
   }
   if(difference>1)
   {
     System.out.println("no");
     return;
   }
   System.out.println("yes");
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter two strings:");
   String sentance1=sc.nextLine();
   String sentance2=sc.nextLine();
   check(sentance1,sentance2);
 }
}
