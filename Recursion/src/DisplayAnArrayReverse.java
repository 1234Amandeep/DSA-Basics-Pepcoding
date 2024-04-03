import java.util.*;

public class DisplayAnArrayReverse {
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
      displayArrReverse(arr, 0);
    }
  }

  // 🪄🪄🪄 function signature
  public static void displayArrReverse(int[] arr, int idx)
  {
    // 🔑🔑🔑 logic
    if(idx == arr.length)
    {
      return;
    }
    displayArrReverse(arr, idx + 1);
    System.out.println(arr[idx]);
  }
}
