package Massiv;

import java.util.Scanner;

public class massiv15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = in.nextInt();
        }
        int sum = 1;
        for (int i = 0; i < n; i++) {
            if (size[i] != 0) {
                sum = sum * size[i];
            }
        }
        System.out.println(sum + " ");
    }
}
