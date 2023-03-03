package Metod;

import java.util.Scanner;

public class Metod5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        contains(str1,str2);

    }

    public static void contains(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}