import java.util.*;

public class RotatingArray {
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

      // how much to rotate


      int k = scn.nextInt();
      if(k < 0)
      {
        k = arr.length + k;
      }

      // 🔑🔑🔑 logic
      // rotating k times
      for(int i = 0; i < k % arr.length; i++)
      {
        int holder1 = 0;
        int holder2;
        int next = 1;
        for(int current = 0; current < arr.length; current++)
        {
          next = next % arr.length;

          if(current == 0)
          {
            holder1 = arr[next];
            arr[next] = arr[current];
          }
          else
          {
            holder2 = arr[next];
            arr[next] = holder1;
            holder1 = holder2;
          }

          next++;
        }

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
