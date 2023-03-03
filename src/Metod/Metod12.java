package Metod;
import java.util.Scanner;
public class Metod12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        check(n);
    }

    public static void check(String str) {
        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + "" + str.charAt(i));

        }
    }
}