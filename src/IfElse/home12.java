package IfElse;
import java.util.Scanner;
public class home12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a>b && b>c) {
            System.out.println(b);
        }else if (a<b && b<c) {
            System.out.println(b);

        }else if (a>b && c>a){
            System.out.println(a);
        }else if (a<b && c<a) {
            System.out.println(a);

        } else if (a>c && b<c){
            System.out.println(c);
        }else if (a<c && b>c){
            System.out.println(c);
        }
    }
}
