import java.util.*;

public class AllIndices {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int Count = 0;
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
      System.out.println(AllIndicesFn(arr, 0, data, Count));
    }
  }

  // 🪄🪄🪄 function signature
  public static int[] AllIndicesFn(int[] arr, int idx,int data, int Count)
  {
    if(arr.length == idx)
    {      
      return new int[Count];
    }
    
    // 🔥🔥🔥 logic
    boolean flag = false;

    if(arr[idx] == data)
    {
      Count++;
      // indices[Count - 1] = idx;
      flag = true;
    }

    int[] indices = AllIndicesFn(arr, idx+1, data, Count);

    if(flag)
    {
      indices[Count - 1] = idx;
    }

    return indices;
  }
}
 
