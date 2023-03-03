package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a <100 || a >200) {
            System.out.println("YES");
        }else if (a <200)
            System.out.println("NO");
    }
}
