import java.util.*;

public class RemovePrime {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {

      // Declaration and Memory allocation 0 size integers type array list
      ArrayList<Integer> list = new ArrayList<>();

      System.out.println(list + " -> " + list.size());

      // Create or add
      int k = 0;
      while(k < 6)
      {
        list.add(scn.nextInt());
        k++;
      }

      System.out.println(list + " -> " + list.size());
      
      // 🔑🔑🔑 logic
      for(int i = 0; i < list.size(); i++)
      {
        boolean isPrime = true;
        int num = list.get(i);

        for(int j = 2; j * j <= num; j++)
        {
          if(num % j == 0)
          {
            isPrime = false;
            break;
          }
        }

        if(isPrime)
        {
          list.remove(i);
          i--;
        }
      }
      
      System.out.println(list + " -> " + list.size());
    }
  }
}
