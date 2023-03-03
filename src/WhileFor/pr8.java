package WhileFor;

import java.util.Scanner;

public class pr8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = n; i <= m; i = i + 1) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}