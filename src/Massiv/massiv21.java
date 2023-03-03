package Massiv;

import java.util.Scanner;

public class massiv21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int size[] = new int[n];
        int min;
        for (int i = 0; i < n; i++) {
            size[i] = in.nextInt();
        }
        min = size[0];
        for (int i = 0; i < n; i++) {
            if (size[i] < min) {
                min = size[i];
            }
        }
        System.out.print(min + " ");

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (size[i] > max) {
                max = size[i];
            }
        }
        System.out.print(max + " ");
    }
}

