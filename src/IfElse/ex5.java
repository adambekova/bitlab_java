package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 2;
        if (n%b == 0) {
            System.out.println("EVEN");
        } else if (n%b != 0) {
            System.out.println("ODD");
        }
    }
}
