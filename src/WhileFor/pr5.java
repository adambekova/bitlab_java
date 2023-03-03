package WhileFor;

import java.util.Scanner;

public class pr5 {
          public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int i = n;
            while (i<=m) {
                System.out.print(i + " ");
                i = i + 1;
            }
        }
}
