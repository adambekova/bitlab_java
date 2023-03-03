package IntDouble;

import java.util.Scanner;

public class home6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int sum = (x*x*x)+(5*x*y)-6*z*y+(z*z*z);
        System.out.println(sum);
    }
}
