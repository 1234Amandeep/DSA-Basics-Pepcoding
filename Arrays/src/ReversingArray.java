import java.util.*;

public class ReversingArray {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      
      // 🔥🔥🔥 Array decl. + Memory alloc. inside heap and stack
      int[] arr = new int[n];
      
      // 🔥🔥🔥 Taking input from the user
      int l = 0;
      while(l < arr.length)
      {
        arr[l] = scn.nextInt();
        l++;
      }

      // 🔑🔑🔑 logic
      // reversing logic using something like binary search
      for(int i = 0; i < arr.length / 2; i++)
      {
        int holder = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = holder;
      }

      // just displaying
      int j = 0;
      while(j < arr.length)
      {
        System.out.println(arr[j]);
        j++;
      }

    }
  }
}
