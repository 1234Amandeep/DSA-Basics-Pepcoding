import java.util.*;

public class QuickSort {
    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int n = scn.nextInt();
            int[] arr = new int[n];

            int x = 0;
            while(x < n)
            {
                arr[x] = scn.nextInt();
                x++;
            }
            // int pivot = scn.nextInt();

            System.out.println("Sorted arr: ");
            //📢📢📢 fn call
            quickSort(arr, 0, arr.length - 1);
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    //🪄🪄🪄 Fn declaration
    public static void quickSort(int[] arr, int lo, int hi)
    {
      if(lo >= hi)
      {
        return;
      }
      int pivot = arr[hi];
      int pi = partitionArr(arr, pivot, lo, hi);
      quickSort(arr, lo, pi - 1);
      quickSort(arr, pi + 1, hi);

    }


    //🪄🪄🪄 Fn declaration
    public static int partitionArr(int[] arr, int pivot, int lo, int hi)
    {
        //🔑🔑🔑 logic
        // i to end -> unknown region
        // 0 to j - 1 -> less than pivot region (or equal to)
        // j to i - 1 -> greater than pivot region
        int i = lo;
        int j = lo;

        while(i < arr.length)
        {
          if(arr[i] > pivot)
          {
            i++;
          }
          else 
          {
            swap(arr, i, j);
            i++;
            j++;
          }
        }

        return j - 1;
        
    }

    

    //🪄🪄🪄 fn decl.
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
