package Stroki;

import java.util.Scanner;

public class Stroki27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n[] = in.nextLine().split(" ");
        int a = Integer.parseInt(n[0]);
        int b = Integer.parseInt(n[2]);
        int c = Integer.parseInt(n[4]);

        int sum = 0;
        if (n[1].equals("+") && n[3].equals("+")) {
            sum = a + b + c;
        }
        if (n[1].equals("+") && n[3].equals("-")) {
            sum = a + b - c;
        }
        if (n[1].equals("-") && n[3].equals("-")) {
            sum = a - b - c;
        }
        if (n[1].equals("-") && n[3].equals("+")) {
            sum = a - b + c;
        }
        if (n[1].equals("+") && n[3].equals("*")) {
            sum = a - b + c;
        }
        if (n[1].equals("*") && n[3].equals("*")) {
            sum = a * b * c;
        }
        if (n[1].equals("*") && n[3].equals("/")) {
            sum = a * b / c;
        }
        if (n[1].equals("/") && n[3].equals("*")) {
            sum = a / b * c;
        }
        if (n[1].equals("*") && n[3].equals("+")) {
            sum = a * b + c;
        }
        if (n[1].equals("/") && n[3].equals("+")) {
            sum = a / b + c;
        }
        if (n[1].equals("*") && n[3].equals("-")) {
            sum = a * b - c;
        }
        if (n[1].equals("+") && n[3].equals("*")) {
            sum = a + b *c;

        }
        System.out.println(sum);

    }
}
