import java.util.*;

public class PrintDecreasingIncreasing {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 📢📢📢 fn Call
      printDecreasingIncreasing(n);
    }
  }

  // 🪄🪄🪄 function decl.
  public static void printDecreasingIncreasing(int n)
  {
    // 🔑🔑🔑 logic
    if(n == 0)
    {
      return;
    }
    System.out.println(n);
    printDecreasingIncreasing(n - 1);
    System.out.println(n);
  }
}
