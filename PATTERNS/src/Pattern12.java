import java.util.*;

public class Pattern12 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int a = 0;
      int b = 1;
      for(int i = 1; i <= n; i++)
      { 
        // magic for each row fibonnaci nums
        for(int j = 1; j <= i; j++)
        {
          System.out.print(a + "\t");
          int c = a + b;
          a = b;
          b = c;
        }
        System.out.println();    
      }
    }
  }
}