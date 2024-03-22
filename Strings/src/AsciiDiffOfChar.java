import java.util.*;

public class AsciiDiffOfChar {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      StringBuilder str = new StringBuilder(scn.nextLine());

      StringBuilder outStr = new StringBuilder();
      
      outStr.append(str.charAt(0));
      // 🔑🔑🔑 logic
      int diff = 0;
      for(int i = 1; i < str.length(); i++)
      {
        char prevCh = str.charAt(i - 1);
        char currCh = str.charAt(i);
        diff = currCh - prevCh;
        
        outStr.append(diff);
        
        outStr.append(str.charAt(i));
      }
      System.out.println(outStr.toString());
    }
  }
}
