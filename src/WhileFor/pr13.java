package WhileFor;

import java.util.Scanner;

public class pr13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 1)
            sum = i+ sum;
            System.out.println(sum);


    }
}