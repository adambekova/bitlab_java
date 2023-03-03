package Massiv;

import java.util.Scanner;

public class massiv24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] slovo = new int[n];
        for (int i = 0; i < n; i++) {
            slovo[i] = in.nextInt();
        }
        int m = in.nextInt();
        int count = -1;
        for (int i = 0; i < n; i++) {
            if (m == slovo[i]) {
                count = i;
            }
        }
        if (count == -1) {
            System.out.println("NO");
        } else {
            System.out.println("YES" + " ");
            System.out.println(count + " ");
        }
    }
}














