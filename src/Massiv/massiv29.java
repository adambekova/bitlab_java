package Massiv;

import java.util.Scanner;

public class massiv29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = in.nextInt();
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (score[i] == 0) {
                m = m + 1;
            }
        }
            int[] score2 = new int[m];
            int a = 0;
            for (int i = 0; i < n; i++) {
                if (score[i] == 0) {
                    score2[a] = i;
                    a=a+1;
                }
            }
            int sum = 0;
            for (int i = score2[0]; i < score2[1]; i++) {
                sum = sum + score[i];
            }
            System.out.print(sum);
        }
    }
