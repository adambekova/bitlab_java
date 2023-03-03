package ObrabotkaOshibok;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < in.length; i++) {

            try {
                in[i] = sc.nextInt();
            } catch (Exception e) {
                in[i] = 0;
                sc.next();
            }
        }
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] * in[i]+" ");
        }
        sc.close();
    }
}





