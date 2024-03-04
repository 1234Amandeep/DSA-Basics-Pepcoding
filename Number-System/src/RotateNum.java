import java.util.*;

public class RotateNum {
  public static void main(String[] args) throws Exception {
      // 🔥🔥🔥 write code from here...
      try(Scanner scn = new Scanner(System.in))
      {
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp1 = n;
        int temp2 = n;

        // Cal no. of digits...
        int digits = 0;
        while(temp1 > 0)
        {
          temp1 = temp1 / 10;

          digits++;
        }
        System.out.println("d: " + digits);

        // 🔑🔑🔑 logic
        if(k < 0)
        {
          k = k + digits;
        }
        
        k = k % digits;
        
        int div = 1;
        int mult = 1;
        if(k % digits == 0)
        {
          System.out.println(temp2);
        }
        else
        {
          for(int i = 0; i < digits; i++)
          {
            if(k % digits == 0)
            {
              break;
            }
  
            if(i < k)
            {
              div = div * 10;
            }
            else 
            {
              mult = mult * 10;
            }
  
          }
          int r = temp2 % div;
          int dividend = temp2 / div;
          temp2 = ((r * mult) + dividend);
        }
      // for(int i = 0; i < k; i++)
      // {
      //   if(k % digits == 0)
      //   {
      //     break;
      //   }

      //   int r = temp2 % 10;
      //   int dividend = temp2 / 10;
      //   temp2 = (dividend + (r * (int)Math.pow(10, digits - 1)));
      // }
      System.out.println(temp2);

      }
  }
}
