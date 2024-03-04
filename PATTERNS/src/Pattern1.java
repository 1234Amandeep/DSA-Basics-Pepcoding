import java.util.*;

public class Pattern1 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 1; i <= n; i++)
      {
        for(int j = 0; j < i; j++)
        {
          System.out.print("*");
        }
        System.out.println("");
      }
    }
  }
}
