import java.util.*;

public class Pattern7 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 1; i <= n; i++)
      {
        
        // magic for spacing
        for(int j = 1; j <= n; j++)
        {
          if(i == j)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        
        System.out.println();    
      }
    }
  }
}