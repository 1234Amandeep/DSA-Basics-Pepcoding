import java.util.*;

public class PrintPermutations{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String str = scn.nextLine();
      // 📢📢📢 fn Call
      printPermutation(str, "");
    }
  }

  // 🪄🪄🪄 function signature
  public static void printPermutation(String ques, String asf)
  {
    // 🔑🔑🔑 logic
    if(ques.length() == 0)
    {
      System.out.println(asf);
      return;
    }

    for(int i = 0; i < ques.length(); i++)
    {
      char ch = ques.charAt(i);
      String lqPart = ques.substring(0, i);
      String rqPart = ques.substring(i + 1);
      String roq = lqPart + rqPart;
      printPermutation(roq, asf + ch);
    }
  }
}
 
