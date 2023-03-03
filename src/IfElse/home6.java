package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;
public class home6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a%4 ==0 || a%400 ==0) {
            System.out.println("YES");
        }else if (a%100 !=0){
            System.out.println("NO");
        }
    }
}
