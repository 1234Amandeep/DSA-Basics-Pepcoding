import java.util.*;

public class TillNPrimeNum {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int low = scn.nextInt(); // low = 5
      int high = scn.nextInt(); // high = 11

      //🔑🔑🔑logic
      for(int i = low; i <= high; i++) // 5, 6, 7, 8, 9, 10, 11
      {
        int isPrime = 0;
        for(int div = 2; div * div <= i; div++) // 2, 3, 4
        {
          if(i % div == 0) // 5 % 2 = 1, 5 % 3 = 2, 5 % 4 = 1
          {
            isPrime++;
            break;
          }
        }

        if(isPrime == 0)
        {
          System.out.println(i);
        }
      }
      


    }
  }
}
