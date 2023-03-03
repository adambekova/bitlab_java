package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a-b >= 100 || b-a >= 100) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
