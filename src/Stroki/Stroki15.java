package Stroki;

import java.util.Scanner;

public class Stroki15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        String x = "aeiou";

        int s = 0;
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==(x.charAt(i))) {
                    s++;
                }
            }
        }
            System.out.println(s);
        }
    }
