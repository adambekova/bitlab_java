package Massiv;

import java.util.Scanner;

public class massiv28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = in.nextInt();
        }
            for (int i = 0; i < n; i++) {
            if (size[i]%2==0) {
            System.out.print(size[i] + " ");
            }
        }
    }
}
