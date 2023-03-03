package Massiv;

import java.util.Scanner;

public class massiv27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mda = new int[n];
        for (int i = 0; i < n; i++) {
            mda[i] = in.nextInt();
        }
        int max = mda[0];
        int index_max = 0;
        int min = mda[0];
        int index_min=0;
        for (int i = 0; i < n; i++) {
            if (mda[i] > max) {
                max = mda[i];
                index_max = i;
            }
            if (mda[i] < min) {
                min = mda[i];
                index_min=i;
            }
        }
        int t = mda[index_max];
        mda[index_max] = mda [index_min];
        mda[index_min] = t;
        for (int i = 0; i < n; i++) {
            System.out.print(mda[i] + " ");
        }
    }
}







