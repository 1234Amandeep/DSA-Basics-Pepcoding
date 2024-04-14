import java.util.*;

public class PrintMazePathsWithJump{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int m = scn.nextInt();
      // 📢📢📢 fn Call
      printMazePathsWJ(1, 1, n, m, "");
    }
  }

  // 🪄🪄🪄 function signature
  public static void printMazePathsWJ(int sr, int sc, int dr, int dc, String psf)
  {
    // 🔑🔑🔑 logic
    if(sr == dr && sc == dc)
    {
      System.out.println(psf);
      return;
    }

    for(int i = 1; i <= dr - sr; i++)
    {
      printMazePathsWJ(sr + i, sc, dr, dc, psf + "v" + i);
    }
    
    for(int i = 1; i <= dc - sc; i++)
    {
      printMazePathsWJ(sr, sc + i, dr, dc, psf + "h" + i);
    }

    for(int i = 1; i <= dr - sr && i <= dc - sc; i++)
    {
      printMazePathsWJ(sr + i, sc + i, dr, dc, psf + "d" + i);
    }
  }
}
 
