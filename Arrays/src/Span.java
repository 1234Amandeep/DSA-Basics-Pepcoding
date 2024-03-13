import java.util.*;

public class Span {
    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int n = scn.nextInt();

            // 🔥🔥🔥 Array decl. and storing pointer in stack
            int[] nums;

            // 🔥🔥🔥 Array memory alloc. inside heap
            nums = new int[n];

            // 🔥🔥🔥 taking input from user
            int i = 0;
            while(i < nums.length)
            {
                nums[i] = scn.nextInt();
                i++;
            }

            // 🔑🔑🔑 logic
            int smallest = nums[0];
            int largest = nums[0];
            for(int j = 1; j < nums.length; j++)
            {
                if(nums[j] > largest)
                {
                    largest = nums[j];
                }
                if(nums[j] < smallest)
                {
                    smallest = nums[j];
                }
            }
            int span = largest - smallest;

            System.out.println(span);
        }
    }
}
