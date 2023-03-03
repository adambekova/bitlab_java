package WhileFor;

import java.util.Scanner;

public class pr25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double d = in.nextInt();
        double sum = 1;
       while (d !=0){
            sum = sum*d;
          d = in.nextInt();
        }
        System.out.println(sum);
    }

}



