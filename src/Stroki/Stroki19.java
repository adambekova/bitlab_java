package Stroki;

import java.util.Scanner;

public class Stroki19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print(str.charAt(1)+""+(Integer.parseInt(String.valueOf(str.charAt(0))))*2);


    }
}