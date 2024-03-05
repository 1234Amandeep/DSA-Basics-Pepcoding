import java.util.*;

public class Pattern5 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int sp = n / 2;
      int st = 1;
      for(int i = 1; i <= n; i++)
      {
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
          sp--;
          st+=2;
        }
        else
        {
          sp++;
          st-=2;
        }       
      }
    }
  }
}