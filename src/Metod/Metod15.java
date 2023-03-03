package Metod;

import java.util.Scanner;

public class Metod15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {1, 0, 2, 0, 3, 4, 5};
        check(n);
    }

    public static void check(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i!=j) {
                    x =  1;
                }
            }
            if (x == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}



