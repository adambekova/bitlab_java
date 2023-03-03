package WhileFor;

import java.util.Scanner;

public class pr28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int sum = 1;
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}