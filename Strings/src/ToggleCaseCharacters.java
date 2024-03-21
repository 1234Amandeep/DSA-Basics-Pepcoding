import java.util.*;

public class ToggleCaseCharacters {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      StringBuilder str = new StringBuilder();

      str.append(scn.nextLine());
      System.out.println(str);
      
      // 🔑🔑🔑 logic
      for(int i = 0; i < str.length(); i++)
      {
        char ch = str.charAt(i);

        //pepcoding solution
        if('a' <= ch && 'z' >= ch)
        {
          int uprChCode = 'A' + ch - 'a';
          char uprch = (char) uprChCode;
          str.setCharAt(i, uprch);
        }
        else
        {
          int lowChCode = 'a' + ch - 'A';
          char lowCh = (char) lowChCode;
          str.setCharAt(i, lowCh);
        }

        // my solution
          // int asciiCode = (int) ch;
          // if(asciiCode > 90)
          // {
          //   asciiCode -= 32;
          //   char capCh = (char) asciiCode;
          //   str.setCharAt(i, capCh);
          // }
          // else
          // {
          //   asciiCode += 32;
          //   char lowCh = (char) asciiCode;
          //   str.setCharAt(i, lowCh);
          // }
      }
      System.out.println(str.toString());
    }
  }
}
