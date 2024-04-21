import java.util.*;

public class KnightsMove{
  
  public static void main(String[] args) throws Exception {
    // 🔥🔥🔥 write code from here...
    try(Scanner scn = new Scanner(System.in))
    {
      int n = scn.nextInt();
      int r = scn.nextInt();
      int c = scn.nextInt();
      int[][] chess = new int[n][n];
      
      // 📢📢📢 fn Call
      printKnightsMove(chess, r, c, 1);
    }
  }

  // 🪄🪄🪄 function signature
  public static void printKnightsMove(int[][] chess, int r, int c, int move)
  {
    // 🔑🔑🔑 logic
    if(r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] != 0)
    {
      return;
    }
    else if(move == chess.length * chess.length)
    {
      chess[r][c] = move;
      System.out.println(move);
      chess[r][c] = 0;
    }

    chess[r][c] = move;
    printKnightsMove(chess, r - 2, c + 1, move + 1);
    printKnightsMove(chess, r - 1, c + 2, move + 1);
    printKnightsMove(chess, r + 1, c + 2, move + 1);
    printKnightsMove(chess, r + 2, c + 1, move + 1);
    printKnightsMove(chess, r + 2, c - 1, move + 1);
    printKnightsMove(chess, r + 1, c - 2, move + 1);
    printKnightsMove(chess, r - 1, c - 2, move + 1);
    printKnightsMove(chess, r - 2, c - 1, move + 1);
    chess[r][c] = 0;
  }
}
 
