import java.util.*;

public class FirstIndexOfOccurance {
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
      int num = scn.nextInt();

      // 📢📢📢 fn Call
      System.out.println(firstIdxOfOcc(arr, 0, num));
    }
  }

  // 🪄🪄🪄 function signature
  public static int firstIdxOfOcc(int[] arr, int idx,int num)
  {
    // 🔑🔑🔑 logic
    if(idx == arr.length)
    {
      return -1;
    }
    if(arr[idx] == num)
    {
      return idx;
    }
    else
    {
      return firstIdxOfOcc(arr, idx + 1, num);  
    }
  }
}
 
