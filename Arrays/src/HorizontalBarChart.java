import java.util.*;

public class HorizontalBarChart {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      
      // 🔥🔥🔥 Array decl. + Memory alloc. inside heap and stack
      int[] nums = new int[n];
      
      // 🔥🔥🔥 Taking input from the user
      int j = 0;
      while(j < nums.length)
      {
        nums[j] = scn.nextInt();
        j++;
      }

      // 🔑🔑🔑 logic
      for(int i = 0; i < nums.length; i++)
      {
        // magic
        for(int k = 0; k < nums[i]; k++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
