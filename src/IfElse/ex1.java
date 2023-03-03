package IfElse;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0) {
            System.out.println("POSITIVE");
            if (a<0) {
                System.out.println("");
            }
        }
    }

}
