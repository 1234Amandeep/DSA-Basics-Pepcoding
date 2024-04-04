import java.util.*;

public class MaxOfAnArray {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int[] arr = new int[n];

      int i = 0;
      while(i < arr.length)
      {
        arr[i] = scn.nextInt();
        i++;
      }

      // 📢📢📢 fn Call
      System.out.println(maxOfArray(arr, 0));
    }
  }

  // 🪄🪄🪄 function signature
  public static int maxOfArray(int[] arr, int idx)
  {
    // 🔑🔑🔑 logic
    if(idx == arr.length - 1)
    {
      return arr[idx];
    }
    int max = maxOfArray(arr, idx + 1);
    if(max < arr[idx])
    {
      max = arr[0];
    }

    return max;
  }
}
