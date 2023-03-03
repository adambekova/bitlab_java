package Massiv;

import java.util.Scanner;

public class massiv22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] raznost = new int[n];
        int min;
        int max = 0;
        for (int i = 0; i < n; i++) {
            raznost[i] = in.nextInt();
        }
        int sum = 0;
        min = raznost[0];
        for (int i = 0; i < n; i++) {
            if (raznost[i] > max) {
                max = raznost[i];}
            if (raznost[i] < min) {
                    min = raznost[i];
                }
            }
            sum = max - min;
        System.out.println(sum);
    }
}


