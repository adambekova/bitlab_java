package Metod;

import java.util.Scanner;

public class Metod16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] n = new int[a];
        for(int i=0;i<a;i++){
            n[i] = in.nextInt();
        }
        check(n);
    }

    public static void check(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " ");

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max + " ");
    }
}

