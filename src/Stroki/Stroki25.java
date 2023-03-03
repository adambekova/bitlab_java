package Stroki;

import java.util.Scanner;

public class Stroki25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().split(" ");
        String str2 = "<";
        String str3 = ">";


        String result = "";

        for (int i = 0; i < str.length; i++) {
            if (String.valueOf(str[i]).equals(str2)) {

                for (int j = 0; j < str[i + 1].length(); j++) {
                    result = result + str[i + 1].charAt(j);
                }
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}


