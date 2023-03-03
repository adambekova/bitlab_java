package Massiv;

import java.util.Scanner;

public class massiv13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] chislo = new int[n];
        for (int i = 0; i < n; i++) {
            chislo[i] = in.nextInt();
        }
        float sum = 0;
        float count=0;
        float sum3=0;
        for (int i =0; i<n; i++) {
            if (chislo[i]<0) {
                sum = sum + chislo[i];
                count = count + 1;
                sum3 = sum / count;
            }
        }
        System.out.println(sum3 +" ");
    }
}



