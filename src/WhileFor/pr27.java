package WhileFor;

import java.util.Scanner;

public class pr27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i = i + 1) {
            sum = sum +  1.0/i;
        }
        System.out.println(sum);

    }
}