import java.util.*;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int n = scn.nextInt();
            int[] arr = new int[n];

            int x = 0;
            while(x < arr.length)
            {
                arr[x] = scn.nextInt();
                x++;
            }
            
            System.out.println("Sorted arr: ");
            //📢📢📢 fn call
            int[] res = mergeSort(arr, 0, arr.length - 1);
            for(int i = 0; i < res.length; i++)
            {
                System.out.print(res[i] + ", ");
            }
            System.out.println();
        }
    }

    //🪄🪄🪄 Fn declaration
    public static int[] mergeSort(int[] arr, int lo, int hi)
    {
      // 🔑🔑🔑 logic
      if(lo == hi)
      {
        int[] baseArr = new int[1];
        baseArr[0] = arr[lo];
        return baseArr;
      }

      int mid = (hi + lo) / 2;
      int[] leftSortedArr = mergeSort(arr, lo, mid);
      int[] rightSortedArr = mergeSort(arr, mid + 1,  hi);
      int[] fullSortedArr = mergeTwoSortedArr(leftSortedArr, rightSortedArr);
 
      return fullSortedArr;
    }

    //🪄🪄🪄 Fn declaration from previous
    public static int[] mergeTwoSortedArr(int[] a, int[] b)
    {
        //🔑🔑🔑 logic
        int[] res = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length)
        {
          if(a[i] < b[j])
          {
            res[k] = a[i];
            i++;
          }
          else
          {
            res[k] = b[j];
            j++;
          }
          k++;
        }

        while(i < a.length)
        {
          res[k] = a[i];
          i++;
          k++;
        }

        while(j < b.length)
        {
          res[k] = b[j];
          j++;
          k++;
        }

        return res;
    }

    //🪄🪄🪄 fn decl.
    public static boolean isGreater(int[] arr, int i, int j)
    {
        if(arr[i] > arr[j])
        {
            return true;
        }
        return false;
    }

    //🪄🪄🪄 fn decl.
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
