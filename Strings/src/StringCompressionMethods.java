import java.util.*;

public class StringCompressionMethods {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String s = scn.nextLine();

      // Method 1: where string = "aaabbccaddee" & compressed string = "abcade"
      String outStr1 = String.valueOf(s.charAt(0));

      for(int i = 1; i < s.length(); i++)
      {
        char curr = s.charAt(i);
        char prvCh = s.charAt(i - 1);
        if(curr != prvCh)
        {
          outStr1 += curr;
        }
      }
      System.out.println(outStr1);

      // Method 2: where string = "aaabbccaddee" & compressed string = "a3b2c2ad2e2"
      String outStr2 = String.valueOf(s.charAt(0));
      int counter = 1;

      for(int i = 1; i < s.length(); i++)
      {
        char curr = s.charAt(i);
        char prvCh = s.charAt(i - 1);
        if(curr != prvCh)
        {
          if(counter > 1)
          {
            outStr2 += counter;
            counter = 1;
          }
          outStr2 += curr;
        }
        else
        {
          counter++; // 1, 2, 3
        }
      }
      if(counter != 1)
      {
        outStr2 += counter;
      }
      System.out.println(outStr2);

    }
  }
}
