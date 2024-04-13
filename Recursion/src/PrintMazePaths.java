import java.util.*;

public class PrintMazePaths{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int m = scn.nextInt();
      // 📢📢📢 fn Call
      printMazePaths(1, 1, n, m, "");
    }
  }

  // 🪄🪄🪄 function signature
  public static void printMazePaths(int sr, int sc, int dr, int dc, String psf)
  {
    // 🔑🔑🔑 logic
    if(sr == dr && sc == dc)
    {
      System.out.println(psf);
      return;
    }
    if(sr < dr)
    {
      printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    }  
    if(sc < dc)
    {
      printMazePaths(sr, sc + 1, dr, dc, psf + "h");
    }  
  }
}
 
