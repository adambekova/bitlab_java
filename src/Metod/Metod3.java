package Metod;

import java.util.Locale;
import java.util.Scanner;

public class Metod3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();
        String name2 = in.next();

 System.out.println(getCount(name,name2));
    }

    public static int getCount(String name, String name2) {
        name = name.toLowerCase();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (String.valueOf(name.charAt(i)).equals(name2)) {
                count++;
            }
        }
        return count;
    }

}
