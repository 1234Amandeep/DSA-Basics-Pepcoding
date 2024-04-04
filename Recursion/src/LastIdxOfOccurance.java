import java.util.*;

public class LastIdxOfOccurance {
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
      int data = scn.nextInt();

      // 📢📢📢 fn Call
      System.out.println(lastIdxOfOcc(arr, 0, data));
    }
  }

  // 🪄🪄🪄 function signature
  public static int lastIdxOfOcc(int[] arr, int idx,int data)
  {
    // 🔑🔑🔑 logic
    if(idx == arr.length)
    { 
      return -1;
    }

    int liisa = lastIdxOfOcc(arr, idx + 1, data);
    
    if(liisa == -1)
    {
      if(arr[idx] == data)
      {
        return idx;
      }
      else
      {
        return -1;
      }
    }
    else
    {
      return liisa;
    }
    
  }
}
 
