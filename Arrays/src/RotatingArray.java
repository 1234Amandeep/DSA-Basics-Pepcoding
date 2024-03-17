import java.util.*;

public class RotatingArray {

  public static void ReverseArr(int[] a, int sPnt, int ePnt)
  {
    while(sPnt < ePnt)
    {
      int temp = a[sPnt];
      a[sPnt] = a[ePnt];
      a[ePnt] = temp;

      sPnt++;
      ePnt--;
    }
  }
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

      // for larger nums
      k = k % arr.length;
      if(k < 0)
      {
        k += arr.length;
      }

      // 🔑🔑🔑 super logic 
      // rotating k times
      
      // part1 reversal
      ReverseArr(arr,0, arr.length - k - 1);

      // part2 reversal 
      ReverseArr(arr, arr.length - k, arr.length - 1);

      // whole reversal
      ReverseArr(arr, 0, arr.length - 1);

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
