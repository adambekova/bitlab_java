package Main.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            String str = in.nextLine();
            set.add(str);
        }
            System.out.print(set.size() + " ");
        }
    }


