import java.util.*;

public class GetSubSequences {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      String str = scn.nextLine();


      // 📢📢📢 fn Call
      System.out.println(gss(str));
    }
  }

  // 🪄🪄🪄 function signature
  public static ArrayList<String> gss(String str)
  {
    if(str.length() == 0)
    {
      ArrayList<String> emtStrList = new ArrayList<>();
      emtStrList.add("");
      return emtStrList;
    }
    
    // 🔑🔑🔑 logic
    char ch = str.charAt(0);
    String ros = str.substring(1);

    ArrayList<String> rres = gss(ros);

    ArrayList<String> mrres = new ArrayList<>();

    for(int i = 0; i < rres.size(); i++)
    {
      mrres.add("" + rres.get(i));
      mrres.add(ch + rres.get(i));
    }

    return mrres;
  }
}
 
