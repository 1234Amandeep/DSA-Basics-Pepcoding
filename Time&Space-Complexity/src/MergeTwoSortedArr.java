import java.util.*;

public class MergeTwoSortedArr {
    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];

            int x = 0;
            while(x < a.length)
            {
                a[x] = scn.nextInt();
                x++;
            }
            int y = 0;
            while(y < b.length)
            {
                b[y] = scn.nextInt();
                y++;
            }

            System.out.println("Sorted arr: ");
            //📢📢📢 fn call
            int[] res = mergeTwoSortedArr(a, b);
            for(int i = 0; i < res.length; i++)
            {
                System.out.print(res[i] + ", ");
            }
            System.out.println();
        }
    }

    //🪄🪄🪄 Fn declaration
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
