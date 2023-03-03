package Massiv;

import java.util.Scanner;

public class massiv25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] znahenie = new int[n];
        for (int i = 0; i < n; i++) {
            znahenie[i] = in.nextInt();
        }
        float max = 0;
        float count = 0;
        float sum = 0;
        float m = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (znahenie[i] > m) {
                max = max + znahenie[i];
                count = count+1;
                sum = max/count;
            }
        }
        System.out.print(sum + " ");
    }
}



