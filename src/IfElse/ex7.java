package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.util.Scanner;
import java.util.StringJoiner;
public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>=1 && a<=4) {
            System.out.println("Beginners School");
        }else if (a>=5 && a<=9) {
            System.out.println("Middle School");
        }else if (a>=9 && a<=11) {
            System.out.println("High School");
        }
        System.out.println("");
    }
}

