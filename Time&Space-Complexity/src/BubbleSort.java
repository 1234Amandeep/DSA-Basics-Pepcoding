import java.util.*;

public class BubbleSort {
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
            bubbleSort(arr);
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    //🪄🪄🪄 Fn declaration
    public static void bubbleSort(int[] arr)
    {
        //🔑🔑🔑 logic
        for(int itr = 1; itr <= arr.length - 1; itr++)
        {
            for(int j = 0; j < arr.length - itr; j++)
            {
                if(isSmaller(arr, j + 1, j))
                {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    //🪄🪄🪄 fn decl.
    public static boolean isSmaller(int[] arr, int i, int j)
    {
        if(arr[i] < arr[j])
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
