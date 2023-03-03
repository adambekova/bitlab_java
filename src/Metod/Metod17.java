package Metod;

import java.util.Scanner;

public class Metod17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String k = in.next();
        char l = k.charAt(0);
        System.out.print(check(n, m,l));
    }

    public static int check(int a, int b, char c) {
int result=0;
        if (String.valueOf(c).equals("+")) {
            result=a+b;
        }
       else if (String.valueOf(c).equals("-")) {
            result=a-b;
        }
      else if (String.valueOf(c).equals("*")) {
            result=a*b;
        }
       else  if (String.valueOf(c).equals("/")) {
            result=a/b;
        }
        return result;
    }
}



