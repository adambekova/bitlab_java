package WhileFor;

import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i = i + 1;
        }
    }
}