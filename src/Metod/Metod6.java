package Metod;
import java.util.Scanner;
public class Metod6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        String parol = in.nextLine();
        System.out.println(check(login,parol));
    }

    public static String check (String str1, String str2) {
        String a = "admin";
        String b = "qwerty";
            if (str1.equals(a) && str2.equals(b)){
            return "Authentication completed";
        }else return "Invalid login or password";
    }
}
