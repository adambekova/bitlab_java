package Metod;

import java.util.Scanner;

public class Metod20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(check(n));
    }

    public static String check(int a) {
        if (a == 12 || a == 1 || a == 2) {
            return "Winter";
        }
        else if (a >= 3 && a <= 5) {
            return "Spring";
        }
        else if (a >= 6 && a <= 8) {
            return "Summer";
        } else
            return "Autumn";
    }
}

