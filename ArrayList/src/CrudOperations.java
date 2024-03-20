import java.util.*;

public class CrudOperations {
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    
    // Declaration and Memory allocation 0 size integers type array list
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println(list + " -> " + list.size());

    // Create or add
    list.add(10);
    list.add(30);
    list.add(20);

    System.out.println(list + " -> " + list.size());

    // Retrieve single element
    int element = list.get(1);

    System.out.println(element);

    // Delete an element
    list.remove(1);
    System.out.println(list + " -> " + list.size());

    // update an element
    list.set(1, 15);
    System.out.println(list + " -> " + list.size());

    // Insert
    list.add(1, 12);
    System.out.println(list + " -> " + list.size());

    // loop over the list
    // method 1:
    for(int i = 0; i < list.size(); i++)
    {
      System.out.println(list.get(i));
    }

    // method 2:
    for(int val: list)
    {
      System.out.println(val);      
    }

  }
}
