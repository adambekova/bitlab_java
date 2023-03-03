package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 3;
        int c = 5;
        int sum = a%b;
        int sum2 = a%c;
        if (sum ==0 || sum2 ==0) {
            System.out.println("YES");
        } else if (sum !=0 || sum2!=0) {
            System.out.println("NO");
        }
    }
}
