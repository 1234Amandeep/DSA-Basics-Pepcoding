import java.util.*;

public class Pattern19 {
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
          // for the 1st row
          if(i == 1)
          {
            if(k == n || k <= n / 2 + 1)
            {
              System.out.print("*\t");
            }
            else
            {
              System.out.print("\t");
            }
          }
          // for rows after 1 row but before middle row
          else if(i <= n / 2)
          {
            if(k == n / 2 + 1 || k == n)
            {
              System.out.print("*\t");
            }
            else
            {
              System.out.print("\t");
            }
          }
          // for the middle row
          else if(i == n / 2 + 1)
          {
            System.out.print("*\t");
          }
          // for rows after middle row and before last row
          else if(i <  n)
          {
            if(k == 1 || k == n / 2 + 1)
            {
              System.out.print("*\t");
            }
            else
            {
              System.out.print("\t");
            }
          }
          // for the last row
          else
          {
            if(k == 1 || k >= n / 2 + 1)
            {
              System.out.print("*\t");
            }
            else
            {
              System.out.print("\t");
            }
          }
        }
        System.out.println();

               
      }
    }
  }
}