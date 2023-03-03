package IfElse;
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;

public class home4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        if (s >=159 && s <=171) {
            System.out.println("S");
        }else if (s >=172 && s <=177) {
            System.out.println("M");
        }else if (s >=178 && s <=183) {
            System.out.println("L");
        }else if (s >=184 && s <=189){
            System.out.println("XL");
        }
    }
}
