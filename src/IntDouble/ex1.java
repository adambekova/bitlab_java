package IntDouble;

import javax.print.DocFlavor;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("S = " + a * b);
        System.out.println("P = " + 2 * (a + b));

    }
}



