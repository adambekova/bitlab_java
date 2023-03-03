package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else if (c <= b && c <= a ) {
            System.out.println(c);
        }
    }
}
