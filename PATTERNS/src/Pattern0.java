import java.util.*;

public class Pattern0 {
  public static void main(String[] args) throws Exception {
    int triLen = 8;
    for (int i = 1; i <= triLen; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
