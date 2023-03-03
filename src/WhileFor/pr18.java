package WhileFor;

import java.util.Scanner;

public class pr18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 3; i <=n*3; i = i + 3) {

            sum = sum + i;
        }
            System.out.println(sum);
        }

    }

