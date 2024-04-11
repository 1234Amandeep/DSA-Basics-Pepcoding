import java.util.*;

public class GetMazePathJump{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int m = scn.nextInt();
      // 📢📢📢 fn Call
      ArrayList<String> paths = gmpj(1, 1, n, m);
      System.out.println(paths);
    }
  }

  // 🪄🪄🪄 function signature
  public static ArrayList<String> gmpj(int sr, int sc, int dr, int dc)
  {
    // 🔑🔑🔑 logic
    if(sr == dr && sc == dc)
    {
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }

    ArrayList<String> paths = new ArrayList<>();

    // horizontal moves
    for(int ms = 1; ms <= dc - sc; ms++)
    {
      ArrayList<String> hPaths = gmpj(sr, sc + ms, dr, dc);
      for(String hPath: hPaths)
      {
        paths.add("h" + ms + hPath);
      }
    }

    // vertical moves
    for(int ms = 1; ms <= dr - sr; ms++)
    {
      ArrayList<String> vPaths = gmpj(sr + ms, sc, dr, dc);
      for(String vPath: vPaths)
      {
        paths.add("v" + ms + vPath);
      }
    }

    // diagonal moves
    for(int ms = 1; (ms <= dc - sc) && (ms < dr - sr); ms++)
    {
      ArrayList<String> dPaths = gmpj(sr + ms, sc + ms, dr, dc);
      for(String dPath: dPaths)
      {
        paths.add("d" + ms + dPath);
      }
    }
    return paths;
  }
}
 
