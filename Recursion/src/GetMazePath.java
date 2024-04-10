import java.util.*;

public class GetMazePath{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int m = scn.nextInt();
      // 📢📢📢 fn Call
      ArrayList<String> paths = gmp(1, 1, n, m);
      System.out.println(paths);
    }
  }

  // 🪄🪄🪄 function signature
  public static ArrayList<String> gmp(int src, int dst, int n, int m)
  {
    // 🔑🔑🔑 logic
    if(src == n && dst == m)
    {
      ArrayList<String> bres = new ArrayList<>();
      bres.add(src + "" + dst + " ");
      return bres;
    }
    else if(src > n || dst > m)
    {
      ArrayList<String> bres = new ArrayList<>();
      return bres;
    }
    
    ArrayList<String> paths1 = gmp(src + 1, dst, n, m);
    ArrayList<String> paths2 = gmp(src, dst + 1, n, m);

    ArrayList<String> paths = new ArrayList<>();

    for(String path: paths1)
    {
      paths.add(src + "" + dst + " " + path);
    }
    for(String path: paths2)
    {
      paths.add(src + "" + dst + " " + path);
    }
   
    return paths;
  }
}
 
