package WhileFor;

import java.util.Scanner;

public class pr14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i = i + 1)
            sum = sum + i;
            System.out.println(sum);


    }
}
