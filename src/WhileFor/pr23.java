package WhileFor;

import java.util.Scanner;

public class pr23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = n;
     //   int count = 0;
        //int sum = 0;
        while (n != 0) {
            if (n>=max){
             max = n;
            }
          //sum = sum + n;
            n = in.nextInt();

        } System.out.println(max);
    }
}

