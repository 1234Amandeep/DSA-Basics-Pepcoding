import java.util.*;

public class FloodFill{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int m = scn.nextInt();
      int[][] arr = new int[n][m];
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < m; j++)
        {
          arr[i][j] = scn.nextInt();
        }
      }

      boolean[][] visited = new boolean[n][m];
      // 📢📢📢 fn Call
      floodFill(arr, 0, 0, "", visited);
    }
  }

  // 🪄🪄🪄 function signature
  public static void floodFill(int[][] maze, int row, int col, String psf, boolean[][] visited)
  {
    // 🔑🔑🔑 logic
    if(row < 0 || col < 0 || row > maze.length - 1 || col > maze[0].length - 1 || maze[row][col] == 1 || visited[row][col] == true)
    {
      return;
    }

    if(row == maze.length - 1 && col == maze[0].length - 1)
    {
      System.out.println(psf);
      return;
    }

    visited[row][col] = true;
    floodFill(maze, row - 1, col, psf + "t", visited);
    floodFill(maze, row, col + 1, psf + "r", visited);
    floodFill(maze, row + 1, col, psf + "d", visited);
    floodFill(maze, row, col - 1, psf + "l", visited);
    visited[row][col] = false;
  }
}
 
