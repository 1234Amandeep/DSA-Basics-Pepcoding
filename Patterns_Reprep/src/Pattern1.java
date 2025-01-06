import java.util.*;

public class Pattern1 {
    public static void main(String[] args) throws Exception {
        int zLen = 5;
        for (int i = zLen; i >= 1; i--) {
            for (int j = 0; j < zLen; j++) {
                if (i == j + 1 || (i == zLen || i + zLen <= zLen + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
