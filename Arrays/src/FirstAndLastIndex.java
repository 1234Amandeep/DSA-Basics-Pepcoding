import java.util.*;

public class FirstAndLastIndex {

  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int[] arr = {10, 10, 20, 20, 20, 20, 20, 20, 90, 100};
      int data = 20;

      // Binary Search Algo.
      // Pepcoding logic
      int li = 0;
      int fi = 0;
      int l = 0;
      int h = arr.length - 1;
      // logic for Last Index
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
          li = m;
          l = m + 1;
        }
      }

      // logic for First Index
      l = 0;
      h = arr.length - 1;

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
          
          fi = m;
          h = m - 1;
        }
      }

      System.out.println("First: " + fi);
      System.out.println("Last: " + li);

          // My logic
          // while(l <= h)
          // {
          //   int m = (l + h) / 2;
          //   if(arr[m] < data)
          //   {
          //     l = m + 1;
          //   }
          //   else if(arr[m] > data)
          //   {
          //     h = m - 1;
          //   }
          //   else 
          //   {
          // // 🔑🔑🔑 super logic 
          // l = m - 1;
          // h = m + 1;

          // if(arr[l] == data)
          // {
          //   while(arr[l] == data)
          //   {
          //     l--;
          //   }
          //   l += 1;
          // }
          // else
          // {
          //   l = m;
          // }

          // if(arr[h] == data)
          // {
          //   while(arr[h] == data)
          //   {
          //     h++;
          //   }
          //   h -= 1;
          // }
          // else
          // {
          //   h = m;
          // }
       
    }
  }
}
