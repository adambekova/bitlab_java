package IfElse;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a - 10 == b) {
            System.out.println("YES");
        } else if (a - 10 != b)
            System.out.println("NO");
    }
}
