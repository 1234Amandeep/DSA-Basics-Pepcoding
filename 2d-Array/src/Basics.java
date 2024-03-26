import java.util.*;

public class Basics {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int m = scn.nextInt();
      int n = scn.nextInt();

      // Declaring a 2d array or creating a pointer in stack which holds null
      int[][] nums;

      // Creating 2d array in heap memory and setting the pointer to point to array[arrays]
      nums = new int[m][n];

      // Taking input from the user and storing it or assign it to 2d array
      int i = 0;
      while(i < m)
      {
        for(int j = 0; j < n; j++)
        {
          int num = scn.nextInt();
          nums[i][j] = num;
        }
        i++;
      }

      i = 0;
      while (i < m) 
      {
        for(int j = 0; j < n; j++)
        {
          System.out.print(nums[i][j]);
        }
        System.out.println();
        i++;
      }
    }
  }
}