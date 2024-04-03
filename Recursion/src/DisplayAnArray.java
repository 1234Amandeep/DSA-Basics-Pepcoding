import java.util.*;

public class DisplayAnArray {
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
      displayArr(arr, 0);
    }
  }

  // 🪄🪄🪄 function signature
  public static void displayArr(int[] arr, int idx)
  {
    // 🔑🔑🔑 logic
    if(idx == arr.length)
    {
      return;
    }
    System.out.println(arr[idx]);
    displayArr(arr, idx + 1);
  }
}
