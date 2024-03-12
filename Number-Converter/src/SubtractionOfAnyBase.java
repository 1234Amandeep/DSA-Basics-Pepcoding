import java.util.*;

public class SubtractionOfAnyBase {

  public static int SubAnyBaseNum(int num1,int num2, int b)
  {
    int rv = 0;

    int carry = 0;
    int p = 1;
    while((num1 != 0))
    {
      int s1 = num1 % 10;
      int s2 = num2 % 10;
      
      int d = s1 - carry;
      
      
      //🔑🔑🔑 super logic
      if(d < s2)
      {
        if(num1 < 10)
        {
          break;
        }
        d += b;
        carry = 1;
      }
      if(d == 0)
      {
        break;
      }

      d -= s2;

      rv += d * p;
      p = p * 10;

      num1 = num1 / 10;
      num2 = num2 / 10;
    }

    return rv;
  }
    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int b = scn.nextInt();

            
            int result = SubAnyBaseNum(num1, num2, b);
            System.out.println(result);
        }
    }
}
