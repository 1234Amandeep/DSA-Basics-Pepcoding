import java.util.*;

public class PermutationsOfString {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      StringBuilder str = new StringBuilder(scn.nextLine());

      // 🔑🔑🔑 logic
      int fact = 1;
      for(int i = 2; i <= str.length(); i++)
      {
        fact *= i;
      }

      for(int i = 0; i < fact; i++)
      {
        int temp = i;
        StringBuilder outStr = new StringBuilder(str);
        for(int div = str.length(); div >= 1; div--)
        {
          int q = temp / div;
          int r = temp % div;

          System.out.print(outStr.charAt(r));
          outStr.deleteCharAt(r);
          temp = q;
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
