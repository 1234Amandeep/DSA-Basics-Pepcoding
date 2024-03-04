import java.util.*;

public class Fibonnaci {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int a = 0;
      int b = 1;
      for(int i = 0; i < n; i++) // 0, 1, 2, 3, 4, 5, 6, 7, 8
      {
        System.out.println(a);
        int sum = a + b; 
        a = b;
        b = sum;
      }
    }
  }
}