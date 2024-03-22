import java.util.*;

public class Factorial {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int fact = 1;
      for(int i = 0; i < n; i++)
      {
        fact += fact * i;
      }
      System.out.println(fact);
    }
  }
}
