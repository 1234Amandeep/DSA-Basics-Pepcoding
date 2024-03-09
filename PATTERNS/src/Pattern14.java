import java.util.*;

public class Pattern14 {
  public static void main(String[] args) throws Exception {
    //🔥🔥🔥write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();

      // 🔑🔑🔑 logic
      for(int i = 1; i <= 10; i++)
      { 
        System.out.println(n + " * " + i + " = " + n * i);    
      }
    }
  }
}