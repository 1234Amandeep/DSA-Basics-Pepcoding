import java.util.*;

public class PrimeFactorNum {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
        System.out.println("Enter n:");
        int n = scn.nextInt();
        System.out.println("n: " + n);

      // logic 🔑🔑🔑 
      for(int div = 2; div * div <= n; div++) //🔥🔥🔥 for non-prime cases
      {
        while(n % div == 0)
        {
          n = n / div;
          System.out.print(div + " ");
        }
      }

      if(n != 1) //🔥🔥🔥 for prime case
      {
        System.out.print(n);
      }      
    }
  }
}
