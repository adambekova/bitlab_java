package IfElse;
import java.util.Scanner;
public class home10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c && b < c && b < c) {
            System.out.println((a / 10) + (a % 10) + (b / 10) + (b % 10));

        } else if (a > b && a > c && c < a && c < b) {
            System.out.println((a / 10) + (a % 10) + (c / 10) + (c % 10));

        } else if (b > a && b > c && a < b && a < c) {
            System.out.println((b / 10) + (b % 10) + (a / 10) + (a % 10));

        } else if (b > a && b > c && c < b && c < a){
            System.out.println((b / 10) + (b % 10) + (c / 10) + (c % 10));

        }else if (c>a && c>b && a<b && a<c) {
            System.out.println((c / 10) + (c % 10) + (a / 10) + (a % 10));

        }else if (c>a && c>b && b<c && b<a){
            System.out.println((c/10) + (c%10) + (b/10) + (b%10));
        }
    }
}

