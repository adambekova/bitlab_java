package Stroki;

import java.util.Scanner;

public class Stroki13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + (String.valueOf(str.charAt(i)));
        }
        System.out.println(res);

    }
}


