package Stroki;

import java.util.Scanner;

public class Stroki16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();


        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = Integer.parseInt(String.valueOf(str.charAt(i))) + sum;
            }
        }
        System.out.print(sum);
    }
}





