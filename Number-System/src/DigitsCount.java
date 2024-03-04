import java.util.*;

public class DigitsCount {
    public static void main(String[] args) throws Exception {
      // 🔥🔥🔥 write code from here...
      try(Scanner scn = new Scanner(System.in))
      {
        // Count Digits of number
        System.out.println("Enter N:");
        int n = scn.nextInt();
        int temp1 = n;
        int temp2 = n;
        int temp3 = n;
        int temp4 = n;

        // 🔑🔑🔑 logic
        int digits = 0;
        while(temp1 > 0)
        {
          temp1 = temp1 / 10;         
          digits++;
        }

        System.out.println("NumOfDigits: " + digits);

        // Print Digits of a number from Left -> Right
        
          // 🔥🔥🔥 logic
          int divisor = (int) Math.pow(10, digits - 1); //10 * 10
          for(int i = 0; i < digits; i++){
              int dividend = temp2 / divisor; // 123 / 100 = 1, 23 / 10 = 2
              System.out.println(dividend);  
              temp2 = temp2 % divisor;
              divisor = divisor / 10; // 10 * 10 / 10 = 10
          }

        // Print Digits of a number from Right -> Left


          // 🔥🔥🔥 logic
          for(int i = 1; temp3 > 0; i++){
            int r = temp3 % 10; // 123 % 10 = 3
            System.out.println(i + " digit: " + r);
            temp3 = temp3 / 10; // 123 / 10 = 12
          }

        // Inverse of a Number
          // 🔥🔥🔥 logic
          int inv = 0;
          for(int i = 1; i <= digits; i++)
          {
            int digit = temp4 % 10; // 123 % 10 = 3
            temp4 = temp4 / 10; // 123 / 10 = 12

            inv = inv + (i * ((int) Math.pow(10, digit - 1)));
          }

          System.out.println("Inverse of " + n + " is :" + inv);




      }
    }
}
