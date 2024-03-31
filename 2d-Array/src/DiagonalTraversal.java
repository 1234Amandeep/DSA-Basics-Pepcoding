import java.util.*;

public class DiagonalTraversal {
  public static void main(String args[]) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int row = scn.nextInt();
      int col = scn.nextInt();

      int[][] matx = new int[row][col];
      for(int l = 0; l < matx.length; l++)
      {
        for(int k = 0; k < matx[0].length; k++)
        {
          matx[l][k] = scn.nextInt();
        }
      }

      // 🔑🔑🔑 logic
      for(int g = 0; g < matx[0].length; g++)
      {
        for(int i = 0, j = g; j < matx[0].length; i++, j++)
        {
          System.out.println(matx[i][j]);
        }
      }
      
    }
  }
}
