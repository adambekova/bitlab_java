package Massiv;

import java.util.Scanner;

public class massiv8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i%2 != 0) {
                System.out.print(index[i] + " ");
            }
        }
    }
}