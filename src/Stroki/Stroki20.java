package Stroki;

import java.util.Scanner;

public class Stroki20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().split(" ");
        int x = Integer.parseInt(String.valueOf(str[0]));
        int y = Integer.parseInt(String.valueOf(str[2]));
        int result = 0;

        if (String.valueOf(str[1]).equals("+")) {
            result = x + y;
        } else if (String.valueOf(str[1]).equals("-")) {
            result = x - y;
        } else if (String.valueOf(str[1]).equals("*")) {
            result = x * y;
        } else if (String.valueOf(str[1]).equals("/")) {
            result = x / y;
        }
        System.out.println(result);
    }
}

