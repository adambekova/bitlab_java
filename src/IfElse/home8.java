package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;


public class home8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int f = in.nextInt();
        int d = 2;

        if (a > b && a > c && a > f)
            if (a%d !=0) {
                System.out.println("NO RESULT");
            }else {
                System.out.println(a);

            }else if (b>a && b>c && b>f)
            if (b%d !=0) {
                System.out.println("NO RESULT");
            }else {
                System.out.println(b);

            }else if (c>a && c>b && c>f)
            if (c%d !=0) {
                System.out.println("NO RESULT");
            }else {
                System.out.println(c);

            }else if (f>a && f>b && f>c)
            if (f%d !=0) {
                System.out.println("NO RESULT");
            }else {
                System.out.println(f);

            }
    }

}
