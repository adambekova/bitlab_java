package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;


public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a != b) {
            System.out.println(a + b);
        } else if (a == b) {
            System.out.println("0");
        }
    }
}
