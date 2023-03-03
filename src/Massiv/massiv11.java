package Massiv;

import java.util.Scanner;

public class massiv11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       int [] sum = new int[n];
        for (int i = 0; i < n; i++) {
            sum[i] = in.nextInt();
        }
        double per = 0;
        double per2 =0;
        for (int i = 0; i < n; i++) {
            per = per + sum[i];
            per2 = per/n;
        }
        System.out.print((int)per + " ");
        System.out.print(per2 + "");
    }
}
