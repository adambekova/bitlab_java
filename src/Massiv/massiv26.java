package Massiv;

import java.util.Scanner;

public class massiv26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = in.nextInt();
        }
        for (int i = n-1; i>=0; i--) {
                      System.out.print(size[i] + " ");
            }
        }
    }
