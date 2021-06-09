import java.util.Scanner;
public class CapitalReverse
{
   static void function(String s)
   {
      String[] capArr = s.split("\\s");
      StringBuilder cap = new StringBuilder("");
      for (String elem: capArr)
      {
         String capLetter = elem.substring(0, 1);
         String lowLetters = elem.substring(1, elem.length());
         capLetter = capLetter.toUpperCase();
         cap.append(capLetter);
         cap.append(lowLetters);
         cap.append(" ");
           
      }
      System.out.println("String after capitalizing the first letter of each word\n" + cap);
      String capStr = cap.toString();
      String[] revArr = capStr.split("\\s");
      // Final output
      StringBuilder rev = new StringBuilder("");
      // Used to reverse
      StringBuilder r = new StringBuilder("");
      int len = revArr.length;
      for (int i = 0; i < len; i ++)
      {
         if (i % 2 == 0)
         {
            rev.append(revArr[i]);
            rev.append(" ");
         }
         else
         {
            r.append(revArr[i]);
            r.reverse();
            rev.append(r);
            rev.append(" ");
            r.setLength(0);
         }
      }
      System.out.println("String after reversing every other word: \n" + rev);
   }
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      while (true)
      {
         System.out.print("Enter a string or -1 to quit: \n");
         String userin = scan.nextLine();
         if (userin.equals("-1"))
         {
            break;
         }
         else
         {
            function(userin);
         }
      }
   }
}