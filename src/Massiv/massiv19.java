package Massiv;

import java.util.Scanner;

public class massiv19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        int min;
        for (int i = 0; i < n; i++) {
            mass[i] = in.nextInt();
        }

        min = mass[0];
        for (int i = 0; i < n; i++) {
            if (mass[i] < min) {
                min = mass[i];
                 }
        }
            System.out.print(min*min + " ");
        }

    }


