package Main.ArrayList;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> str = new HashSet<>();
        while (true) {
            String n = in.next().toLowerCase();
            if (n.equals("stop"))
                break;
            str.add(n);
        }
        int count = 0;
        for (String elem : str) {
            for (int i = 0; i < elem.length(); i++) {
                if (String.valueOf(elem.charAt(i)).equals("a")) {
                    count++;
                }
                if (String.valueOf(elem.charAt(i)).equals("e")) {
                    count++;
                }
                if (String.valueOf(elem.charAt(i)).equals("i")) {
                    count++;
                }
                if (String.valueOf(elem.charAt(i)).equals("o")) {
                    count++;
                }
                if (String.valueOf(elem.charAt(i)).equals("u")) {
                    count++;
                }
            }
        }System.out.println(count);
    }
}