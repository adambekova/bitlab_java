package WhileFor;

import java.util.Scanner;

public class pr21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int sum = 0;
        while (n != 0) {
            count = count + 1;
            sum = sum + n;
            n = in.nextInt();

        } System.out.println(sum);
        }
    }
