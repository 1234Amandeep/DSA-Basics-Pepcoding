import java.util.*;

public class BinarySearchAlgoArrayPrac {

  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
      int find = 70;

      // Binary Search Algo.
      int l = 0;
      int h = arr.length - 1;
      
      while(l <= h)
      {
        int m = (l + h) / 2;
        if(arr[m] < find)
        {
          l = m + 1;
        }
        else if(arr[m] > find)
        {
          h = m - 1;
        }
        else
        {
          System.out.println(m);
          return;
        }
      }
      System.out.println(-1);
      
    }
  }
}
