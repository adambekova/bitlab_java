package WhileFor;

import java.util.Scanner;

public class pr17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k=1;
        int sum = 0;
       for (int i = 1; i <= n; i = i + 1) {


           sum = sum + k;
           k = k + 2;
       }
                  System.out.print(sum);

        }
    }
