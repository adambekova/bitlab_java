package Metod;

import java.util.Scanner;

public class Metod19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = in.nextInt();
        }
        check(b);
    }

    public static void check(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 50 && (array[i] % 5 == 0)) {
                    System.out.println(array[i]);
                }
            }
        }
    }




