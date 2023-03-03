package Massiv;

import java.util.Scanner;

public class massiv6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] save = new int[n];
        for (int i = 0; i < n; i++) {
            save[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
           System.out.print(save [i]* save [i] + " ");
            }
        }
    }
