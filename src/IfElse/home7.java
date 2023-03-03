package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;

public class home7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b && a > c && b > c) {
            System.out.println(a - c);
        } else if (a > b && a > c && b < c) {
            System.out.println(a - b);
        } else if (b > a && b > c && c > a) {
            System.out.println(b - a);
        } else if (b > a && b > c && c < a) {
            System.out.println(b - c);
        } else if (c > a && c > b && b > a) {
            System.out.println(c - a);
        } else if (c > a && c > b && b < a)
            System.out.println(c-b);

    }
}
