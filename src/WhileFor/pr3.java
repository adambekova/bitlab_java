package WhileFor;

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int i = 0;
        while (i<n) {
            System.out.println(s);
            i=i+1;
        }
    }
}



