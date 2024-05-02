import java.util.*;

public class InsertionSort {
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

            System.out.println("Sorted arr: ");
            //📢📢📢 fn call
            insertionSort(arr);
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    //🪄🪄🪄 Fn declaration
    public static void insertionSort(int[] arr)
    {
        //🔑🔑🔑 logic
        for(int i = 1; i < arr.length; i++)
        {
          //reverse buble sort
          for(int j = i - 1; j >= 0; j--)
          {
            if(isGreater(arr, j, j + 1))
            {
              swap(arr, j, j + 1);
            }
            else 
            {
              break;
            }
          }
        }
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
