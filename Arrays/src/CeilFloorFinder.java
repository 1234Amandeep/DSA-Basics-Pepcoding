import java.util.*;

public class CeilFloorFinder {

  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
      int data = 52;

      int ceil = 0;
      int floor = 0;

      // Binary Search Algo.
      int l = 0;
      int h = arr.length - 1;
      while(l <= h)
      {
        int m = (l + h) / 2;
        if(arr[m] < data)
        {
          l = m + 1;
        }
        else if(arr[m] > data)
        {
          h = m - 1;
        }
        else 
        {
          ceil = arr[m];
          floor = arr[m];
          System.out.println("ceil: " + ceil);
          System.out.println("floor: " + floor);
          return;
        }
      }

      ceil = arr[l];
      floor = arr[h];
      System.out.println("ceil: " + ceil);
      System.out.println("floor: " + floor);
    }
  }
}
