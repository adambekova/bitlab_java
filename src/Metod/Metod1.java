package Metod;

import java.util.Scanner;

public class Metod1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d = in.nextInt();
        int e = in.nextInt();
        int g = in.nextInt();

        System.out.println(getMax(d,e,g));
           }


    public static int getMax(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max=b;
        }
        if (max < c) {
           max=c;
        }
        return max;

    }
}

