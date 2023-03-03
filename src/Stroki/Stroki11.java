package Stroki;

import java.util.Scanner;

public class Stroki11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String chr = in.nextLine();

        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chr.equalsIgnoreCase(String.valueOf(str.charAt(i)))) {
                s++;
            }
        }
            System.out.println(s);
        }
    }




