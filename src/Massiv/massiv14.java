package Massiv;

import java.util.Scanner;

public class massiv14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] save = new int[n];
        for (int i = 0; i < n; i++) {
            save[i] = in.nextInt();
        }
        double sum = 0;
        double count = 0;
        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + save[i];
            count = count + 1;
            sum2 = sum / count;
        }
        for (int i = 0; i < n; i++) {
            if (save[i] > sum2) {
                System.out.print(save[i] + " ");
            }
        }
    }
}



