import java.util.*;

public class VerticalBarChart {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      
      // 🔥🔥🔥 Array decl. + Memory alloc. inside heap and stack
      int[] nums = new int[n];
      
      // 🔥🔥🔥 Taking input from the user
      int k = 0;
      while(k < nums.length)
      {
        nums[k] = scn.nextInt();
        k++;
      }

      // 🔑🔑🔑 logic for max
      int max = nums[0];
      for(int i = 1; i < nums.length; i++)
      {
        if(nums[i] > max)
        {
          max = nums[i];
        }
      }

      // 🔑🔑🔑 logic
      for(int i = 0; i < max; i++)
      {
        // ✴️✴️✴️ magic
        for(int j = 0; j < nums.length; j++)
        {
          // 🔑🔑🔑 super logic
          if(max - i <= nums[j])
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
