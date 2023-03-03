package Massiv;

import java.util.Scanner;

public class massiv10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            sum[i] = in.nextInt();
        }
        int per = 0;
        for (int i = 0; i < n; i++) {
            per = per + sum[i];
        }

        System.out.println(per + " ");
    }
}
