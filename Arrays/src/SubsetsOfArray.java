import java.util.*;

public class SubsetsOfArray {

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
      int limit = (int)(Math.pow(2, arr.length));
      for(int i = 0; i < limit; i++)
      {
        String set = "";
        int temp = i;

        // magic for creating sub sets of an array
        // 🔑🔑🔑 super duper logic
        for(int k = arr.length - 1; k >= 0; k--)
        {
          // converting i into binary bit
          int r = temp % 2;
          temp = temp / 2;

          // checking if the current bit is 0 or 1  [1, 1, 0]
          if(r == 0)
          {
            set = "_" + set;
          }
          else
          {
            set = arr[k] + set;
          }
        }
        System.out.println(set);
      }
    }
  }
}
