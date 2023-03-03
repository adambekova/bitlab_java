package Metod;

import java.util.Scanner;

public class Metod8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] abc = new int[a][b];
        check(abc);
    }

    public static void check(int array[][]) {

        int t[] = array[0];
        array[0] = array[array.length- 1];
        array[array.length - 1] = t;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }System.out.println();
    }

}

