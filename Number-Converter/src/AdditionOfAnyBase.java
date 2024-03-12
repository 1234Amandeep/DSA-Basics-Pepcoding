import java.util.*;

public class AdditionOfAnyBase {

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
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            int b = scn.nextInt();

            
            int result = AddAnyBaseNum(num1, num2, b);
            System.out.println(result);
        }
    }
}
