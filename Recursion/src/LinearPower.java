import java.util.*;

public class LinearPower {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int x = scn.nextInt();
      int n = scn.nextInt();

      // 📢📢📢 fn Call
      System.out.println(power(x, n));
    }
  }

  // 🪄🪄🪄 function signature
  public static int power(int x, int n)
  {
    // 🔑🔑🔑 logic
    if(n == 0)
    {
      return 1;
    }
    
    return x * power(x, n - 1);
  }
}
