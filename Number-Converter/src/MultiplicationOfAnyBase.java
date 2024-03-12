import java.util.*;

public class MultiplicationOfAnyBase {

  public static int AddAnyBaseNum(int num1,int num2, int b)
  {
    int rv = 0;

    //🔑🔑🔑 super logic
    int carry = 0;
    int p = 1;
    while((num1 != 0 || num2 != 0) || carry != 0)
    {
      
      int a1 = num1 % 10;
      int a2 = num2 % 10;

      int currAdd = a1 + a2 + carry;

      // 🔥🔥🔥 crazy logic
      carry = currAdd / b;
      currAdd = currAdd % b;

      rv += currAdd * p;
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
            int multiplicant = scn.nextInt();
            int multiplier = scn.nextInt();
            int b = scn.nextInt();

          int result = 0;

          //🔑🔑🔑 logic
           int op = 1;
           int orv = 0;
           while(multiplier > 0)
           {
            // 🔑🔑🔑 magic logic
            int carry = 0;
            int rv = 0;
            int ip = 1;
            int currMultiplier = multiplier % 10;
            int tempMultiplicant = multiplicant;

            while(tempMultiplicant > 0 || carry > 0)
            {
              int currMultiplicant = tempMultiplicant % 10;
              
              int d = currMultiplicant * currMultiplier + carry;

              carry = d / b;
              d = d % b;

              rv += d * ip;
              ip = ip * 10;

              tempMultiplicant = tempMultiplicant / 10;
            }
            
            orv = rv * op;
            op = op * 10;
            result = AddAnyBaseNum(orv, result, b);

            multiplier = multiplier / 10;
           }

            System.out.println(result);
        }
    }
}
