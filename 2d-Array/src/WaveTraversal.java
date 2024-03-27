import java.util.*;

public class WaveTraversal {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int r = scn.nextInt();
      int c = scn.nextInt();

      // Declaring a 2d array or creating a pointer in stack which holds null
      int[][] arr;

      // Creating 2d array in heap memory and setting the pointer to point to array[arrays]
      arr = new int[r][c];

      // Taking input from the user and storing it or assign it to 2d array
      int l = 0;
      while(l < r)
      {
        for(int j = 0; j < c; j++)
        {
          int num = scn.nextInt();
          arr[l][j] = num;
        }
        l++;
      }

      // 🔑🔑🔑 logic
      for(int i = 0; i < arr[0].length; i++)
      { 
        int j;
        if(i % 2 == 0)
        {
          j = 0;
          while(j < arr.length)
          {
            System.out.println(arr[j][i]);

            j++;
          }
        }
        else
        {
          j = arr.length - 1;
          while(j >= 0)
          {
            System.out.println(arr[j][i]);

            j--;
          }
        }
      }

    }
  }
}