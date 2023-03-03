package Massiv;

import java.util.Scanner;

public class massiv17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = in.nextInt();
        }
        int sum = 1;
        for (int i = 0; i < n; i++) {
            if (score[i] != 0) {
                if (i%2 == 0) {
                    sum = sum * score[i];
                }
            }
        }
        System.out.print(sum + " ");
    }
}





