package Stroki;

import java.util.Scanner;

public class Stroki10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i)+ ""+str.charAt(i));
        }
    }
}


