import java.util.*;

public class Pattern11 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int num = 1;
      for(int i = 1; i <= n; i++)
      { 
        // magic for each row nums
        for(int j = 1; j <= i; j++)
        {
          System.out.print(num);
          num++;
        }
        System.out.println();    
      }
    }
  }
}