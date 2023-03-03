package Massiv;

import java.util.Scanner;

public class massiv30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] size = new int[n];
        for (int i = 0; i < size.length; i++) {
            size[i] = in.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < size.length; i++) {
            if (i%2 == 0 && size[i] > 0) {
                count1 = count1 + 1;
            } else if (i%2 != 0 && size[i] < 0) {
                count1 = count1 + 1;
            }
            if (i%2 == 0 && size[i] < 0) {
                count2 = count2 + 1;
            } else if (i%2 != 0 && size[i] > 0) {
                count2 = count2 + 1;
            }
        }
        if (count1 == n || count2 == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

