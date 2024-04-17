import java.util.*;

public class TargetSumSubsets{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = scn.nextInt();
      }
      
      int tar = scn.nextInt();
      
      // 📢📢📢 fn Call
      printTargetSumSubset(arr, 0, 0, "", tar);
    }
  }

  // 🪄🪄🪄 function signature
  public static void printTargetSumSubset(int[] arr, int idx, int sos, String sub, int tar)
  {
    // 🔑🔑🔑 logic
    if(sos > tar)
    { 
      return;
    }
    if(sos == tar)
    {
      System.out.println(sub);
      return;
    }

    for(int i = idx; i < arr.length; i++)
    {
      printTargetSumSubset(arr, i + 1, sos + arr[i], sub + arr[i] + " ", tar);
    }
  }
}
 
