package IfElse;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;

public class home9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a == 8 && b == 7 && c == 0 && d == 1) {
            System.out.println("YES");
        }
        else if (a == 8 && b == 7 && c == 7 && d == 7) {
            System.out.println("YES");
        }
        else if (a == 8 && b == 7 && c == 5 && d == 5) {
            System.out.println("YES");
        }
        else if (a == 8 && b == 7 && c == 0 && d == 7) {
            System.out.println("YES");
        }
        else if (a == 8 && b == 7 && c == 0 && d == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");

        }
    }
}
