import java.util.*;

public class GetKeypadCombination{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String str = scn.nextLine();
      // 📢📢📢 fn Call
      ArrayList<String> words = gkc(str);
      System.out.println(words);
    }
  }
  static String[] input = {
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
  public static ArrayList<String> gkc(String str)
  {
    // 🔑🔑🔑 logic
    if(str.length() == 0)
    {
      ArrayList<String> empArlist = new ArrayList<>();
      empArlist.add("");
      return empArlist;
    }

    char ch = str.charAt(0);
    String ros = str.substring(1);

    ArrayList<String> rral = gkc(ros);

    ArrayList<String> mral = new ArrayList<>();
    for(int j = 0; j < input[ch - '0'].length(); j++)
    {
      char c = input[ch - '0'].charAt(j);
      for(int k = 0; k < rral.size(); k++)
      {
        mral.add(c + rral.get(k));
      }
    }

    return mral;
  }
}
 
