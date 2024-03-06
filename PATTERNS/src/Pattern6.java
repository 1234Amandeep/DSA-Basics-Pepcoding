import java.util.*;

public class Pattern6 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int sp = 1;
      int st = (n / 2) + 1;
      for(int i = 1; i <= n; i++)
      {
        // magic for stars
        for(int k = 0; k < st; k++)
        {
          System.out.print("*");
        }
        
        // magic for spacing
        for(int j = 0; j < sp; j++)
        {
          System.out.print(" ");
        }
        
        // magic for stars
        for(int k = 0; k < st; k++)
        {
          System.out.print("*");
        }

        System.out.println();

        // 🔑🔑🔑 super logic
        if(i <= n / 2)
        {
          sp+=2;
          st--;
        }
        else
        {
          sp-=2;
          st++;
        }       
      }
    }
  }
}