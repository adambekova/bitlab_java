package Massiv;

import java.lang.module.FindException;
import java.util.Scanner;

public class massiv9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] chislo = new int[n];
        for (int i = 0; i < n; i++) {
            chislo[i] = in.nextInt();
        }
        int per = 0;
        for (int i = 0; i < n; i++) {
            if (chislo[i] > 0) {
                per = per + 1;
            }
        }
        System.out.println(per + " ");
    }
}



