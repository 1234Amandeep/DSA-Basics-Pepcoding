import java.util.*;

public class LogPower {
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

    int xnb2 = power(x, n / 2);
    int xn = xnb2 * xnb2;

    if(n % 2 == 1)
    {
      xn = x * xn;
    }
    
    return xn;
  }
}
