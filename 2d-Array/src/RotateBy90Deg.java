import java.util.*;

public class RotateBy90Deg {
  public static void main(String args[]) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int row = scn.nextInt();
      int col = scn.nextInt();

      int[][] orgMatx = new int[row][col];
      for(int l = 0; l < orgMatx.length; l++)
      {
        for(int k = 0; k < orgMatx[0].length; k++)
        {
          orgMatx[l][k] = scn.nextInt();
        }
      }

      // 🔑🔑🔑 logic  rotate 90 deg = transpose of a matrix -> reverse all rows of a transpose matrix.
      // transpose
      for(int i = 0; i < orgMatx.length; i++)
      {
        for(int j = i; j < orgMatx[0].length; j++)
        {
          int temp = orgMatx[i][j];
          orgMatx[i][j] = orgMatx[j][i];
          orgMatx[j][i] = temp;
        }
      }

      // reversing each row of transpose matrix
      for(int i = 0; i < orgMatx.length; i++)
      {
        int li = 0;
        int ri = orgMatx[0].length - 1;

        while(li <= ri)
        {
          int temp = orgMatx[i][li];
          orgMatx[i][li] = orgMatx[i][ri];
          orgMatx[i][ri] = temp;
          li++;
          ri--;
        }
      }

      // display
      for(int i = 0; i < orgMatx.length; i++)
      {
        for(int j = 0; j < orgMatx[0].length; j++)
        {
          System.out.print(orgMatx[i][j]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
