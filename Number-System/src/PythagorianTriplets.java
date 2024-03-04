import java.util.*;

public class PythagorianTriplets {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();

      int max = a;

      if(b >= max)
      {
        max = b;
      }

      if(c >= max)
      {
        max = c;
      }

      boolean flag = false;
      if(max == a)
      {
        flag = ( (a * a) == ((b * b) + (c * c)));
        System.out.println(flag);
      }
      else if(max == b)
      {
        flag = ((b * b) == ((c * c) + (a * a)));
        System.out.println(flag);
      }
      else
      {
        flag = ((c * c) == ((a * a) + (b * b)));
        System.out.println(flag);
      }
    }
  }
}
