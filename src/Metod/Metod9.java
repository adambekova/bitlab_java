package Metod;

import java.util.Scanner;

public class Metod9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        check(m);
    }

    public static void check(int array[]) {
        int count = 0;
        int a = 23;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] != a) {
                count++;
                System.out.println(array[i]);

            } else if (array[i] == 23)
                break;
        }
    }
}