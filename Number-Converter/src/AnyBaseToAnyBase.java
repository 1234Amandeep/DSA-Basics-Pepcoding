import java.util.*;

public class AnyBaseToAnyBase {

    // 🪄🪄🪄 fn declaration...
    public static int AnyBaseToAnyBaseConverter(int n, int ob, int b)
    {   
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
            int ob = scn.nextInt();
            int b = scn.nextInt();

            // 📢📢📢 fn call
            int result = AnyBaseToAnyBaseConverter(n, ob, b);
            System.out.println(result);
        }
    }
}
