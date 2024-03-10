import java.util.*;

public class DigitFrequency {

    // 🔲🔲🔲 fn declaration...
    public static int findDigitFreq(int n, int d)
    {   int df = 0;

        // 🔑🔑🔑 logic
        while(n > 0)
        {
            int r = n % 10;
            n = n / 10;
            if(d == r)
            {
                df++;
            }
        }

        return df;
    }

    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int n = scn.nextInt();
            int d = scn.nextInt();

            // 📢📢📢 fn call
            int df = findDigitFreq(n, d);

            System.out.println(d + " has come, " + df + " times in " + n);
        }
    }
}
