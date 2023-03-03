package Metod;
import java.util.Scanner;
public class Metod13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.println(check(n));
    }

    public static int check(String s1) {
        String s2 = "a, e, i, o, u";
        s1=s1.toLowerCase();
        int s = 0;
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == (s2.charAt(i))) {
                    s++;
                }
            }
            } return s;
    }
}

//Напишите метод, который в аргументы принимает строку. Нужно посчитать количество гласных букв в строке. (Гласные буквы: a, e, i, o, u)