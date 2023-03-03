package Stroki;

import java.util.Scanner;

public class Stroki22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                ans = ans + "0";
            } else {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}


