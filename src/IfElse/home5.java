package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;
public class home5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a == b || b == c || a == c) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
