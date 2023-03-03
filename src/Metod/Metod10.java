package Metod;

import java.util.Scanner;

public class Metod10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        System.out.println(check(m));
    }

    public static int check(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 != 0) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}