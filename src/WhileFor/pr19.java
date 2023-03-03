package WhileFor;

import java.util.Scanner;

public class pr19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        double sum = 0.0;
        double count = 1.0;
        for (int i=n;i <= m; i = i + 1);
        {

            sum =  (n + m) / (count+1);
        }
            System.out.println(sum);

        }
    }
