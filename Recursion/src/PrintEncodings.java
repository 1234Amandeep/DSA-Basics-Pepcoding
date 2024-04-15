import java.util.*;

public class PrintEncodings{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String str = scn.nextLine();
      // 📢📢📢 fn Call
      printEncoding(str, "");
    }
  }

  // 🪄🪄🪄 function signature
  public static void printEncoding(String ques, String asf)
  {
    // 🔑🔑🔑 logic
    if(ques.length() == 0)
    {
      System.out.println(asf);
      return;
    }

    if(ques.length() == 1)
    {
      char ch = ques.charAt(0);
      if(ch == '0')
      {
        return;
      }
      else
      {
        int chv = ch - '0';
        char code = (char)('a' + chv - 1);
        System.out.println(asf + code);
      }
    }
    else
    {
      char ch = ques.charAt(0);
      String roq = ques.substring(1);
      if(ch == '0')
      {
        return;
      }
      else
      {
        int chv = ch - '0';
        char code = (char) ('a' + chv - 1);
        printEncoding(roq, asf + code);
      }

      String ch12 = ques.substring(0, 2);
      String roq12 = ques.substring(2);

      int ch12v = Integer.parseInt(ch12);
      if(ch12v <= 26)
      {
        char code = (char)('a' + ch12v - 1);
        printEncoding(roq12, asf + code);
      } 
    }

  }
}
 
