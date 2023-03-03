package WhileFor;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a != b && a != c && a != d) {
            System.out.println(1);
        } else if (b != a && b != c && b != d){
            System.out.println(2);
    }else if (c!=a && c!=b && c!=d) {
            System.out.println(3);
        }else if (d!=a && d!=b && d!=c){
            System.out.println(4);

                }

    }
}
