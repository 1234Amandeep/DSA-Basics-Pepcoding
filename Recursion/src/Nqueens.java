import java.util.*;

public class Nqueens{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int[][] chess = new int[n][n];
      
      
      // 📢📢📢 fn Call
      printNQueens(chess, "", 0);
    }
  }

  // 🪄🪄🪄 function signature
  public static void printNQueens(int[][] chess, String qsf, int row)
  {
    // 🔑🔑🔑 logic
    if(row == chess.length)
    {
      System.out.println(qsf);
      return;
    }
    for(int col = 0; col < chess.length; col++)
    {
      if(IsItSafeToPlaceQueenHere(chess, row, col) == true)
      {
        chess[row][col] = 1;
        printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
        chess[row][col] = 0;
      }
    }
  }

  public static boolean IsItSafeToPlaceQueenHere(int[][] chess, int row, int col)
  {
    for(int i = row - 1, j = col; i >= 0; i--)
    {
      if(chess[i][j] == 1)
      {
        return false;
      }
    }

    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
    {
      if(chess[i][j] == 1)
      {
        return false;
      }
    }

    for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++)
    {
      if(chess[i][j] == 1)
      {
        return false;
      }
    }

    return true;
  }
}
 
