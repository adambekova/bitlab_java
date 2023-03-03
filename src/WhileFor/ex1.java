package WhileFor;

import java.util.Scanner;

public class ex1 {
    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            if (a == 8 && b == 7 && c == 0 && d == 1) {
                System.out.println("YES");
            } else if (a == 8 && b == 7 && c == 7 && d == 7) {
                System.out.println("YES");
            } else if (a == 8 && b == 7 && c == 5 && d == 5) {
                System.out.println("YES");
            } else if (a == 8 && b == 7 && c == 0 && d == 7) {
                System.out.println("YES");
            } else if (a == 8 && b == 7 && c == 0 && d == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        }
    }
}


