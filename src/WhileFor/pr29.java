package WhileFor;

import java.util.Scanner;

public class pr29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum+i * i;
    } System.out.println(sum);
    }
}