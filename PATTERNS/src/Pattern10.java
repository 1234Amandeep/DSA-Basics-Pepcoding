import java.util.*;

public class Pattern10 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int os = n / 2;
      int is = -1;
      for(int i = 1; i <= n; i++)
      {
        
        // magic for outer space
        for(int j = 0; j < os; j++)
        {
          System.out.print(" ");
        }

        // priniting star  
        System.out.print("*");

        
        if(!(i == 1 || i == n))
        {
          // magic for inner space
          for(int j = 0; j < is; j++)
          {
            System.out.print(" ");
          }
          
          // printing star
          System.out.print("*");
        }

        if(i <= n / 2)
        {
          os--;
          is+=2;
        }
        else
        {
          os++;
          is-=2;
        }
        
        System.out.println();    
      }
    }
  }
}