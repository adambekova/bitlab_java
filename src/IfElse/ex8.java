package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a <= 2019) {
            System.out.println("NO");
        } else if (a >= 2021) {
            System.out.println("YES");
        } else if (a == 2020) {
            System.out.println("ERROR");
        }
    }
}