import java.util.*;

public class PrimeNum {
    public static void main(String[] args) throws Exception {
        //🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            System.out.println("Enter t:");
            int t = scn.nextInt();
            System.out.println("t: " + t);

            // 🔑🔑🔑logic
            for(int i = 0; i < t; i++)
            {
                int n = scn.nextInt();

                int isPrime = 0;
                for(int div = 2; div * div <= n; div++)
                {
                    if(n % div == 0)
                    {
                        isPrime++;
                        break;
                    }
                }

                if(isPrime == 0)
                {
                    System.out.println("prime");
                }
                else
                {
                    System.out.println("not prime");
                }
            }
        }
    }
}
