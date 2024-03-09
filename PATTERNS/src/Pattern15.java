import java.util.*;

public class Pattern15 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      int sp = 2;
      int st = 1;
      int num = 1;
      for(int i = 1; i <= n; i++)
      { 
            // magic for spacing
            for(int j = 1; j <= sp; j++)
            {
              System.out.print(" ");
            }

            // magic for nums
            int rowNum = num;
            for(int k = 1; k <= st; k++)
            {
              System.out.print(rowNum); //1 234 34567 234 1 || 1 232 34543 232 1

              if(k <= st / 2)
              {
                rowNum++;
              }
              else
              {
                rowNum--;
              }
            }

            System.out.println();

            if(i <= n / 2)
            {
              sp--;
              st+=2;
              num++;
            }
            else
            {
              sp++;
              st-=2;
              num--;
            }
      }
    }
  }
}