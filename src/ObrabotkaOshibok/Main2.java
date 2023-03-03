package ObrabotkaOshibok;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int sum = 0;
        try {
            n = sc.nextInt();
            m = sc.nextInt();
            sum = n / m;
            System.out.println(sum + " ");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
