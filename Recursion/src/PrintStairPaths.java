import java.util.*;

public class PrintStairPaths{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      // 📢📢📢 fn Call
      printSP(n, "");
    }
  }

  // 🪄🪄🪄 function signature
  public static void printSP(int n, String paths)
  {
    // 🔑🔑🔑 logic
    if(n == 0)
    {
      System.out.println(paths);
      return ;
    }

    for(int i = 1; i <= 3; i++)
    {
      if(n >= i)
      {
        printSP(n - i, paths + i);
      }
    }  
  }
}
 
