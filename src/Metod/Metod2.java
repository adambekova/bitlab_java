package Metod;

import java.util.Scanner;

public class Metod2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d = in.nextInt();
        int e = in.nextInt();
        int g = in.nextInt();

        System.out.println(getExist(d, e, g));
    }

    public static String getExist(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            return "YES";
        } else return "NO";
    }
}
