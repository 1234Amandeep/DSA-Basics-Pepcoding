import java.util.*;

public class HanoiTower {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int t1 = scn.nextInt();
      int t2 = scn.nextInt();
      int t3 = scn.nextInt();

      // 📢📢📢 fn Call
      toh(n, t1, t2, t3);
    }
  }

  // 🪄🪄🪄 function signature
  public static void toh(int n, int t1, int t2, int t3)
  {
    // 🔑🔑🔑 logic
    if(n == 0)
    {
      return;
    }
    
    toh(n - 1, t1, t3, t2);
    System.out.println(n + "[" + t1 + " -> " + t2 + "]");
    toh(n - 1, t3, t2, t1);
  }
}
