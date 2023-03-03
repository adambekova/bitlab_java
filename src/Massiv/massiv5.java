package Massiv;

import java.util.Scanner;

public class massiv5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] chislo = new int[n];
        for (int i = 0; i < n; i++)
        {
            chislo[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if (chislo[i]%2==0)
            {
                System.out.print(chislo[i] + " ");
            }
        }
    }
}

