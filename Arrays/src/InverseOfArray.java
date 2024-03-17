import java.util.*;

public class InverseOfArray {

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
      // Inv arr
      int[] Inv = new int[arr.length];

      for(int i = 0; i < arr.length; i++)
      {
        int val = arr[i];
        Inv[val] = i;
      }
      

      // just displaying
      for(int val: Inv)
      {
        System.out.println(val);
      }

    }
  }
}
