package WhileFor;

import java.util.Scanner;

public class pr16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        for (int i = n; i <= m; i = i + 1)
            if (i % 2 == 0)
                count = count+1;
        System.out.println(count);

    }
}