import java.util.*;

public class CountSort {
  public static void main(String[] args) {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int[] arr = new int[n];
      int x = 0;
      while(x < arr.length)
      {
        arr[x] = scn.nextInt();
        x++;
      }
      int min = scn.nextInt();
      int max = scn.nextInt();

      //📢📢📢 fn call
      countSort(arr, min, max);

      for(int i = 0; i < arr.length; i++)
      {
        System.out.println(arr[i] + ", ");
      }
      System.out.println();
    }
  }

  // 🪄🪄🪄 fn decleration
  public static void countSort(int[] arr, int min, int max)
  {
    // 🔑🔑🔑 logic
    int range = max - min + 1;
    int[] farr = new int[range];
    for(int i = 0; i < arr.length; i++)
    {
      int idx = arr[i] - min;
      farr[idx]++;
    }
    for(int i = 1; i < arr.length; i++)
    {
      farr[i] = farr[i] + farr[i - 1];
    }

    int[] ans = new int[arr.length];
    for(int i = arr.length - 1; i >= 0; i--)
    {
      int val = arr[i];
      int pos = farr[val - min];
      int idx = pos - 1;
      ans[idx] = val;
      farr[val - min]--;
    }

    for(int i = 0; i < ans.length; i++)
    {
      arr[i] = ans[i];
    }
  }
}
