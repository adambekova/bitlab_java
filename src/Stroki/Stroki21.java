package Stroki;

import java.util.Locale;
import java.util.Scanner;

public class Stroki21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] str2 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


        for (int index = 0; index < str2.length; index++) {
            if (str.equals(str2[index])) {
                System.out.println(index);
            }
        }
    }
}

