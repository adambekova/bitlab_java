package Metod;

import java.util.Scanner;

public class Metod7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = {1, 2, 3, 4, 5};
        System.out.println(check(m));
    }

    public static int check(int array[]) {
        int sum = 0;
        int sum2 = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
                count++;
            }
        }
        sum2 = sum / count;
        return sum2;
    }
}

