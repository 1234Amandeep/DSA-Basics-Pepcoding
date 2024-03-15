import java.util.*;

public class SubtractionOfTwoArrays {
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
      
      // finder bigger & smaller nums
      int[] bigger = nums1;
      int[] smaller = nums2;

      if(nums1.length < nums2.length)
      {
        bigger = nums2;
        smaller = nums1;
      }
      else if(nums1.length == nums2.length)
      {
        int i = 0;
        int j = 0;

        while(i < nums1.length)
        {
          if(nums1[i] > nums2[j])
          {
            break;
          }
          if(nums2[j] > nums1[i])
          {
            bigger = nums2;
            smaller = nums1;
            break;
          }
          i++;
          j++;
        }

      }
      
      // subraction logic
      int[] sub = new int[bigger.length];

      int i = bigger.length - 1;
      int j = smaller.length - 1;
      int k = sub.length - 1;

      int carry = 0;
      while(k >= 0)
      {
        int d = bigger[i] - carry;
        int n2V = j >= 0 ? smaller[j] : 0;

        if(d < n2V)
        {
          d += 10;
          carry = 1;
          d -= n2V;
        }
        else
        {
          d -= n2V;
        }
        
        sub[k] = d;
        i--;
        j--;
        k--;
      }

      int t = 0;
      while(t < sub.length)
      {
        if(sub[t] == 0)
        {
          t++;
        }
        else
        {
          break;
        }
      }
      while(t < sub.length)
      {
        System.out.print(sub[t]);
        t++;
      }


    }
  }
}
