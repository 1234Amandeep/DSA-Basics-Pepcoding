import java.util.*;

public class DecimalToAnyBase {

    // 🪄🪄🪄 fn declaration...
    public static int decimalToAnyBaseConverter(int n, int b)
    {   int ob = 10;
        int rv = 0;
        int p = 1;

        // 🔑🔑🔑 logic
        while(n != 0)
        {
            int r = n % b;
            rv += r * p;
            p = p * ob;
            n = n / b;
        }

        return rv;
    }

    public static void main(String[] args) throws Exception {
        // 🔥🔥🔥 write code from here...
        try(Scanner scn = new Scanner(System.in))
        {
            int n = scn.nextInt();
            int b = scn.nextInt();

            // 📢📢📢 fn call
            int result = decimalToAnyBaseConverter(n, b);
            System.out.println(result);
        }
    }
}
