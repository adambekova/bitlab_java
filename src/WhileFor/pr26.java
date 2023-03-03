package WhileFor;

import java.util.Scanner;

public class pr26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while (n != 0) {
            if (n%2 != 0) {
                sum = sum + n;
              }
            n = in.nextInt();
        }
        System.out.println(sum);
        }
    }



