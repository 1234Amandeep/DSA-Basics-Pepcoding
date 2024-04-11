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
  public static ArrayList<String> gmp(int sr, int sc, int dr, int dc)
  {
    // 🔑🔑🔑 logic
    if(sc == dc && sr == dr)
    {
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }
    ArrayList<String> paths1 = new ArrayList<>();
    ArrayList<String> paths2 = new ArrayList<>();
    
    
    if(sc < dc)
    {
      paths1 = gmp(sr, sc + 1, dr, dc);
    }
    if(sr < dr)
    {
      paths2 = gmp(sr + 1, sc, dr, dc);
    }

    ArrayList<String> paths = new ArrayList<>();

    for(String path: paths1)
    {
      paths.add("h" + path);
    }
    for(String path: paths2)
    {
      paths.add("v" + path);
    }
   
    return paths;
  }
}
 
