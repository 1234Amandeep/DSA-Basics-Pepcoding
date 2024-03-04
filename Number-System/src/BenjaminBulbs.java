import java.util.*;

public class BenjaminBulbs {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 1; i * i <= n; i++)
      {
        System.out.print("b" + i * i + " ");
      }

      // for(int i = 1; i <= n; i++)
      // {
      //   boolean flag = false;

      //   for(int j = 1; j <= i; j++)
      //   {
      //     if(i < j)
      //     {
      //       break;
      //     }
      //     if(i % j == 0)
      //     {
      //       if(flag)
      //       {
      //         flag = false;
      //       }
      //       else
      //       {
      //         flag = true;
      //       }
      //     }
      //   }
      //   if(flag)
      //   {
      //     System.out.print("b" + i + " ");
      //   }
      // }
    }
  }
}
