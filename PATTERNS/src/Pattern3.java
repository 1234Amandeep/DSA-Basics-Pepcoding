import java.util.*;

public class Pattern3 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 1; i <= n; i++)
      {
        // magic for spacing
        for(int j = n - i; j >= 1; j--)
        {
          System.out.print(" ");
        }

        // magic for stars
        for(int k = 0; k < i; k++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}
