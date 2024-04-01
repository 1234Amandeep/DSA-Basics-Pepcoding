import java.util.*;

public class Factorial {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 📢📢📢 fn Call
      System.out.println(factorial(n));
    }
  }

  // 🪄🪄🪄 function decl.
  public static int factorial(int n)
  {
    // 🔑🔑🔑 logic
    if(n == 1)
    {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
