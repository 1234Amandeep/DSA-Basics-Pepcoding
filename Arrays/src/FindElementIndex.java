import java.util.*;

public class FindElementIndex {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      
      // 🔥🔥🔥 Array decl. + Memory alloc. inside heap and stack
      int[] nums = new int[n];
      
      // 🔥🔥🔥 Taking input from the user
      int i = 0;
      while(i < nums.length)
      {
        nums[i] = scn.nextInt();
        i++;
      }
      int f = scn.nextInt();

      // 🔑🔑🔑 logic
      int index = -1;
      for(int j = 0; j < nums.length; j++)
      {
        if(f == nums[j])
        {
          index = j;
          break;
        }
      }

      System.out.println(index);
    }
  }
}
