import java.util.*;

public class PrintKeypadCombinations{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String str = scn.nextLine();
      // 📢📢📢 fn Call
      gkc(str, "");
    }
  }
  static String[] codes = {
    "?!",
    "abc",
    "def",
    "ghi",
    "jkl",
    "mnop",
    "qnst",
    "uv",
    "wxyz",
    ".;",
  };
  // 🪄🪄🪄 function signature
  public static void gkc(String ques, String ans)
  {
    // 🔑🔑🔑 logic
    if(ques.length() == 0)
    {
      System.out.println(ans);
      return;
    }

    char ch = ques.charAt(0);
    String roq = ques.substring(1);
    
    String pressedkeyChars = codes[ch - 48];
    for(int i = 0; i < pressedkeyChars.length(); i++)
    {
      gkc(roq, ans + pressedkeyChars.charAt(i));
    }
  }
}
 
