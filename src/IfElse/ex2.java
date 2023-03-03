package IfElse;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 17;
        if (a%b == 0) {
            System.out.println("DIVISIBLE BY 17 ");
        }
        System.out.println("");
    }
}
