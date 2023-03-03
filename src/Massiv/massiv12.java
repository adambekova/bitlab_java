package Massiv;

import java.util.Scanner;

public class massiv12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] element = new int[n];
        for (int i = 0; i < n; i++) {
            element[i] = in.nextInt();
        }
        double sum = 0;
        double count = 0;
        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (element[i] % 2 == 0) {
                sum = sum + element[i];
                count = count + 1;
                sum2 = sum / count;
            }
        }
        System.out.print(sum2 + " ");
    }
}





