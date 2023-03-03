package WhileFor;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<=n; i=i+1) {
            if (i%2==0){
                System.out.print(i + " ");
                i=i+1;
            };
        }
    }
}