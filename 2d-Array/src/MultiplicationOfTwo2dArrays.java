import java.util.*;

public class MultiplicationOfTwo2dArrays {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int m = scn.nextInt();
      int n = scn.nextInt();

      // Declaring a 2d array or creating a pointer in stack which holds null
      int[][] arr1;

      // Creating 2d array in heap memory and setting the pointer to point to array[arrays]
      arr1 = new int[m][n];

      // Taking input from the user and storing it or assign it to 2d array
      int i = 0;
      while(i < m)
      {
        for(int j = 0; j < n; j++)
        {
          int num = scn.nextInt();
          arr1[i][j] = num;
        }
        i++;
      }

      int j = scn.nextInt();
      int k = scn.nextInt();

      // Declaring a 2d array or creating a pointer in stack which holds null
      int[][] arr2;

      // Creating 2d array in heap memory and setting the pointer to point to array[arrays]
      arr2 = new int[j][k];

      // Taking input from the user and storing it or assign it to 2d array
      i = 0;
      while(i < j)
      {
        for(int o = 0; o < k; o++)
        {
          int num = scn.nextInt();
          arr2[i][o] = num;
        }
        i++;
      }

      i = 0;
      while (i < arr1.length) 
      {
        for(int o = 0; o < arr1[i].length; o++)
        {
          System.out.print(arr1[i][o]);
        }
        System.out.println();
        i++;
      }

      i = 0;
      while (i < arr2.length) 
      {
        for(int o = 0; o < arr2[i].length; o++)
        {
          System.out.print(arr2[i][o]);
        }
        System.out.println();
        i++;
      }

      // 🔑🔑🔑 logic 2 x 3 & 3 x 4 -> 2 x 4
      int[][] result = new int[m][k];
      for(int x = 0; x < result.length; x++)
      {
        for(int z = 0; z < result[0].length; z++)
        {
          int mul = 0;
          for(int y = 0; y < arr1[0].length; y++)
          {
            mul += arr1[x][y] * arr2[y][z];
          }
          result[x][z] = mul;
        }
      }

      for(int x = 0; x < result.length; x++)
      {
        for(int z = 0; z < result[x].length; z++)
        {
          System.out.print(result[x][z] + " ");
        }
        System.out.println();
      }

    }
  }
}