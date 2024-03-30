import java.util.*;

public class ExitMatrix {
  public static void main(String args[]) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int row = scn.nextInt();
      int col = scn.nextInt();

      int[][] arr = new int[row][col];
      for(int l = 0; l < arr.length; l++)
      {
        for(int k = 0; k < arr[0].length; k++)
        {
          arr[l][k] = scn.nextInt();
        }
      }

      // 🔑🔑🔑 logic
      int i = 0;
      int j = 0;
      int dir = 0;
      while (true) {
        dir = (dir + arr[i][j]) % 4;

        if(dir == 0)
        {
          j++;
        }
        else if(dir == 1)
        {
          i++;
        }
        else if(dir == 2)
        {
          j--;
        }
        else
        {
          i--;
        }

        if(j < 0)
        {
          j++;
          break;
        }
        else if(i < 0)
        {
          i++;
          break;
        }
        else if(j > arr[0].length - 1)
        {
          j--;
          break;
        }
        else if(i > arr.length - 1)
        {
          i--;
          break;
        }
      }
      System.out.println("(" + i + ", " + j + ")");
    }
  }
}
