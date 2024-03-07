import java.util.*;

public class Pattern13 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 0; i < n; i++)
      { 
        int val = 1;
        // magic for each row nums using Permutations and Combinations logic
        for(int j = 0; j <= i; j++)
        {
          System.out.print(val + "\t");
          
          if(j == i || j == 0)
          {
            val = 1;
          }
          else
          {
            // 🔑🔑🔑super logic
            val = ((val * (i - j)) / (j + 1));
          }
          
        }
        System.out.println();    
      }
    }
  }
}