package WhileFor;

import java.util.Scanner;


public class pr24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 1;
        for (int i = 1; i <=n; i = i + 1) {

            sum = sum*i;
        }
        System.out.println(sum);
    }

}