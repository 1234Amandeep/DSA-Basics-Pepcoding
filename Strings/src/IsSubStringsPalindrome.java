import java.util.*;

public class IsSubStringsPalindrome {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String s = scn.nextLine();

      // 🔑🔑🔑 logic
      for(int i = 0; i < s.length(); i++)
      {
        for(int j = i + 1; j <= s.length(); j++)
        {
          String currSub = s.substring(i, j); // bccb
          boolean isPalindrome = true;

          // 🔥🔥🔥 magic
          int spntr = 0;
          int epntr = currSub.length() - 1;

          // Only considering more than 1 character strings
          if(currSub.length() > 1)
          {
            while(spntr <= epntr)
            {
              if(currSub.charAt(spntr) != currSub.charAt(epntr))
              {
                isPalindrome = false;
                break;
              }
              spntr++;
              epntr--;
            }
            if(isPalindrome)
            {
              System.out.println(s.substring(i, j));
            }
          }

          
        }
      }
    }
  }
}
