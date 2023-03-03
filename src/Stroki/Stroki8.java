package Stroki;

import java.util.Scanner;

public class Stroki8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String slovo = in.nextLine();
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int index = 0; index < 10; index++) {
            if (slovo.equals(str[index])) {
                System.out.println(index);
            }
        }
    }
}
