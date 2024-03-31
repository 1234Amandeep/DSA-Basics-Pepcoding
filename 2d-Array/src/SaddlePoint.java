import java.util.*;

public class SaddlePoint {
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
      boolean isSaddlePoint = false;
      int saddlePointX = 0;
      int saddlePointY = 0;
      for(int i = 0; i < matx.length; i++)
      {
        int rowMin = matx[i][0];
        int colMax = matx[i][0];
        // find rowMin
        for(int j = 1; j < matx.length; j++)
        {
          if(rowMin > matx[i][j])
          {
            rowMin = matx[i][j];
          }
        }
        int rowMinColAdd = 0;
        // find address of rowMin
        for(int l = 0; l < matx.length; l++)
        {
          if(rowMin == matx[i][l])
          {
            rowMinColAdd = l;
          }
        }

        // find colMax
        for(int k = 0; k < matx[0].length; k++)
        {
          if(colMax < matx[k][rowMinColAdd])
          {
            colMax = matx[k][rowMinColAdd];
          }
        }

        // checking if its a saddle point or not
        if(rowMin == colMax)
        {
          saddlePointX = i;
          saddlePointY = rowMinColAdd;
          isSaddlePoint = true;
          break;
        }
      }
      
      // displaying saddle point
      if(isSaddlePoint)
      {
        System.out.println(matx[saddlePointX][saddlePointY]);
      }
      else
      {
        System.out.println("invalid input");
      }
    }
  }
}
