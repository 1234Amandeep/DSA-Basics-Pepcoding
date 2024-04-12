import java.util.*;

public class PrintSubSequenceOptimal{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String ques = scn.nextLine();
      // 📢📢📢 fn Call
      printSS(ques, ""); // "abc" -> "a"? || "bc", ans -> "" && "a" then, "b"? || "c", ans -> "" && "ab" then "c"? || "", ans -> "" && "abc" now ques == "" so print(ans);
    }
  }

  // 🪄🪄🪄 function signature
  public static void printSS(String ques, String ans)
  {
    // 🔑🔑🔑 logic
    if(ques.length() == 0)
    {
      System.out.println(ans);
      return;
    }

    char ch = ques.charAt(0);
    String roq = ques.substring(1);

    printSS(roq, ans + ch);
    printSS(roq, ans + "_");
  }
}
 
