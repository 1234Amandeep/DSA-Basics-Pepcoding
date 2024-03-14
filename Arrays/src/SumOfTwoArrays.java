import java.util.*;

public class SumOfTwoArrays {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n1 = scn.nextInt();
      
      // 🔥🔥🔥 Array decl. + Memory alloc. inside heap and stack
      int[] nums1 = new int[n1];
      
      // 🔥🔥🔥 Taking input from the user
      int l = 0;
      while(l < nums1.length)
      {
        nums1[l] = scn.nextInt();
        l++;
      }

      int n2 = scn.nextInt();

      // 🔥🔥🔥 Array decl. + Memory alloc. inside heap and stack
      int[] nums2 = new int[n2];
      
      // 🔥🔥🔥 Taking input from the user
      int m = 0;
      while(m < nums2.length)
      {
        nums2[m] = scn.nextInt();
        m++;
      }

      // 🔑🔑🔑 logic
      int[] sum = new int[nums1.length > nums2.length ? nums1.length : nums2.length ];

      
      // 🔑🔑🔑 super logic
      int i = nums1.length - 1;
      int j = nums2.length - 1;
      int k = sum.length - 1;
      
      int carry = 0;
      while (k >= 0)
      {
        int d = carry;
        
        if(i >= 0)
        {
          d += nums1[i];
        }

        if(j >= 0)
        {
          d += nums2[j];
        }

        carry = d / 10;
        d = d % 10;

        sum[k] = d;

        i--;
        j--;
        k--;
      }

      if(carry != 0)
      {
        System.out.print(carry);
      }

      for(int val: sum)
      {
        System.out.print(val);
      }
    }
  }
}
