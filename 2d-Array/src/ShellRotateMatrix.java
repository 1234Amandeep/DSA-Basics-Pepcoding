import java.util.*;

public class ShellRotateMatrix {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int row = scn.nextInt();
      int col = scn.nextInt();

      // Declaring a 2d array or creating a pointer in stack which holds null
      int[][] matx;

      // Creating 2d array in heap memory and setting the pointer to point to array[arrays]
      matx = new int[row][col];

      // Taking input from the user and storing it or assign it to 2d array
      int l = 0;
      while(l < row)
      {
        for(int j = 0; j < col; j++)
        {
          int num = scn.nextInt();
          matx[l][j] = num;
        }
        l++;
      }
      int shell = scn.nextInt();
      int rotate = scn.nextInt();

      for(int i = 0; i < matx.length; i++)
      {
        for(int j = 0; j < matx[0].length; j++)
        {
          System.out.print(matx[i][j]);
        }
        System.out.println();
      }
      System.out.println();
      // 🔑🔑🔑 logic

      // shell logic
      ArrayList<Integer> list = new ArrayList<>();
      
      int minRow = shell - 1;
      int minCol = shell - 1;
      int maxRow = matx.length - shell;
      int maxCol = matx[0].length - shell ;
      System.out.println(minRow + ", " + minCol + ", " + maxRow + ", " + maxCol);

      // left wall
      for(int i = minRow, j = minCol; i <= maxRow; i++)
      {
        list.add(matx[i][j]);
      }
      minCol++;

      // bottom wall
      for(int i = maxRow, j = minCol; j <= maxCol; j++)
      {
        list.add(matx[i][j]);
      }
      maxRow--;

      // right wall
      for(int i = maxRow, j = maxCol; i >= minRow; i--)
      {
        list.add(matx[i][j]);
      }
      maxCol--;

      // top wall
      for(int i = minRow, j = maxCol; j >= minCol; j--)
      {
        list.add(matx[i][j]);
      }
      minRow++;


      // Rotating list
      rotate(list, rotate);
      
      // mapping original matrix shell with rotated list
      minRow = shell - 1;
      minCol = shell - 1;
      maxRow = matx.length - shell;
      maxCol = matx[0].length - shell ;

      int count = 0;
      // left wall
      for(int i = minRow, j = minCol; i <= maxRow; i++)
      {
        matx[i][j] = list.get(count);
        count++;
      }
      minCol++;

      // bottom wall
      for(int i = maxRow, j = minCol; j <= maxCol; j++)
      {
        matx[i][j] = list.get(count);
        count++;
      }
      maxRow--;

      // right wall
      for(int i = maxRow, j = maxCol; i >= minRow; i--)
      {
        matx[i][j] = list.get(count);
        count++;
      }
      maxCol--;

      // top wall
      for(int i = minRow, j = maxCol; j >= minCol; j--)
      {
        matx[i][j] = list.get(count);
        count++;
      }
      minRow++;

      // display
      for(int i = 0; i < matx.length; i++)
      {
        for(int j = 0; j < matx[0].length; j++)
        {
          System.out.print(matx[i][j]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
  public static void rotate(ArrayList<Integer> arr, int r)
  {
    reverse(arr, 0, arr.size() - 1 - r);
    reverse(arr, arr.size() - r, arr.size() - 1);
    reverse(arr, 0, arr.size() - 1);
  }

  public static void reverse(ArrayList<Integer> arr, int li, int ri)
  {
    while(li < ri)
    {
      int temp = arr.get(li);
      arr.set(li, arr.get(ri));
      arr.set(ri, temp);
      li++;
      ri--;
    }
  }
}