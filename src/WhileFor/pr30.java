package WhileFor;

import java.util.Scanner;

public class pr30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum = sum + (i * k);}
                if (sum > n)
                sum = sum - n;
                System.out.print(sum);
    }
}







