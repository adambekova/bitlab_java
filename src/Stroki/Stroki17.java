package Stroki;

import java.util.Scanner;

public class Stroki17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        String result = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            result = result + s1.charAt(i);
        }
        if (result.equals(s2)) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }
    }
}






