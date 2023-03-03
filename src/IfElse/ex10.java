package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b || a == c || b == c) {
            System.out.println("YES");
        } else if (a != b || a != c || b != c) {
            System.out.println("NO");
        }
    }
}
