package Massiv;

import java.util.Scanner;

public class massiv18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
                System.out.print(max + " ");
            }
        }









