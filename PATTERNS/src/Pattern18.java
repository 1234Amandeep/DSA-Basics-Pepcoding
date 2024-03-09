import java.util.*;

public class Pattern18 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int st = n;
      int sp = 0;
      for(int i = 1; i <= n; i++)
      {

        // magic for spaces
        for(int k = 1; k <= sp; k++)
        {
          System.out.print(" ");
        }

        // magic for stars
        for(int k = 1; k <= st; k++)
        {
          // 🔑🔑🔑 special logic for creating that sand timer effect
          if(i > 1 && i <= n / 2)
          {
            if(k  == 1 || k == st)
            {
              System.out.print("*");
            }
            else
            {
              System.out.print(" ");
            }
          }
          else
          {            
            System.out.print("*");
          }
        }
        System.out.println();

        if(i <= n / 2)
        {
          sp++;
          st-=2;
        }
        else 
        {
          sp--;
          st+=2;
        }
        
      }
    }
  }
}