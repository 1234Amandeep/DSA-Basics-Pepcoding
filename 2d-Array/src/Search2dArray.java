import java.util.*;

public class Search2dArray {
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
      int x = scn.nextInt();

      // 🔑🔑🔑 logic
      int i = 0;
      int j = matx[0].length;
      while (i < matx.length && j >= 0) {
        if(matx[i][j] == x)
        {
          System.out.println(i);
          System.out.println(j);
          return;
        }
        else if(matx[i][j] < x)
        {
          i++;
        }
        else
        {
          j--;
        }
      }
      System.out.println("not found");
    }
  }
}
