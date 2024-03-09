import java.util.*;

public class Pattern17 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int st = 1;
      int sp = n / 2;
      for(int i = 1; i <= n; i++)
      {

        // magic for spaces
        for(int k = 1; k <= sp; k++)
        {
          if(i == ((n / 2) + 1))
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }

        // magic for stars
        for(int k = 1; k <= st; k++)
        {
          System.out.print("*");
        }
        System.out.println();

        if(i <= n / 2)
        {
          st++;
        }
        else 
        {
          st--;
        }
        
      }
    }
  }
}