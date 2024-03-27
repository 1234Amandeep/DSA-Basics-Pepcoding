import java.util.*;

public class SpiralTraversal {
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
      int minr = 0;
      int minc = 0;

      int maxr = arr.length;
      int maxc = arr[0].length;

      int cnt = 0;
      int tn = r * c;

      while(cnt < tn)
      {
        // left wall
        for(int i = minr, j = minc; i < maxr && cnt < tn; i++)
        {
          System.out.println(arr[i][j]);
        }
        minc++;

        // bottom wall
        for(int i = maxr, j = minc; j < maxc && cnt < tn; i++)
        {
          System.out.println(arr[i][j]);
        }
        maxr--;

        // right wall
        for(int i = maxr, j = maxc; i < minr && cnt < tn; i++)
        {
          System.out.println(arr[i][j]);
        }
        maxc--;

        // top wall
        for(int i = minr, j = maxc; j < minc && cnt < tn; i++)
        {
          System.out.println(arr[i][j]);
        }
        minr++;
      }

    }
  }
}