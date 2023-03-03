package Metod;

import java.util.Scanner;

public class Metod4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(palindrome(str));

    }

    public static String palindrome(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + String.valueOf(str.charAt(i));
        }
            if (result.equals(str)) {
                return "YES";
            } else {
                return "NO";
            }
    }
}


