import java.util.*;

public class Pattern16 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int st = 1;
      int sp = ((2 * n) - 3);
      int val = 1;
      for(int i = 1; i <= n; i++)
      {

        // magic for nums
        int rowVal = val;
        for(int j = 1; j <= st; j++)
        {
          System.out.print(rowVal);
          
          rowVal++;
        
        }

        // magic for spaces
        for(int k = 1; k <= sp; k++)
        {
          System.out.print(" ");
        }

        // magic for nums
        // 🔑🔑🔑 special case if its a last row go one less
        if(sp < 0)
        {
          st--;
          rowVal--;
        }
        for(int j = 1; j <= st; j++)
        {
          rowVal--;
          System.out.print(rowVal);
        }

        System.out.println();

        st++;
        sp-=2;
      }
    }
  }
}