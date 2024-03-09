import java.util.*;

public class Pattern20 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 1; i <= n; i++)
      {

        // magic for stars
        for(int k = 1; k <= n; k++)
        {
          if((k == 1) || (k == n) || ((i == k) && (i > n / 2)) || ((i + k == n + 1) && (i > n / 2)))
          {
            System.out.print("*\t");
          }
          else
          {
            System.out.print("\t");
          }
        }
        System.out.println();
      }
    }
  }
}