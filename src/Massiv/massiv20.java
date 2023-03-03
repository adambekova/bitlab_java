package Massiv;

import java.util.Scanner;

public class massiv20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int size[] = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = in.nextInt();
        }
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (size[i] > max) {
                max = size[i];
               count = i;
                }
            }
            System.out.print(max + " " + count);

        }
    }





