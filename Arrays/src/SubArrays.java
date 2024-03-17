import java.util.*;

public class SubArrays {

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
      for(int i = 0; i < arr.length; i++)
      {
        // magic
        for(int k = 0; k < arr.length - i; k ++) // [1, 2, 3, 4]
        {
          int[] sub = new int[k + 1];
          int m = i;
          for(int j = 0; j < sub.length; j++)
          {
            sub[j] = arr[m];
            m++;
          }
          System.out.print("[ ");
          for(int val: sub)
          {
            System.out.print(val + " ");
          }
          System.out.print("]");
          System.out.println();
        }
      }
    }
  }
}
