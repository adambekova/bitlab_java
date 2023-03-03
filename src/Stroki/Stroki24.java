package Stroki;

import java.util.Scanner;

public class Stroki24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = "";

        str2 = str2+str.substring(0,1).toUpperCase();
        for (int i=1; i<str.length();i++) {
            if (" ".equals(str.substring(i - 1, i))) {
                str2 = str2 + str.substring(i, i + 1).toUpperCase();
            } else {
                str2 = str2 + str.substring(i, i + 1);
            }
        }
        System.out.println(str2);
    }
}



