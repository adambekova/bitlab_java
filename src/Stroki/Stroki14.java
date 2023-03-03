package Stroki;

import java.util.Scanner;

public class Stroki14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if (s1.contains(s2)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}




