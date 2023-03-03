package Main.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> num = new HashSet<>();
        while (true) {
            int n = in.nextInt();
            if (n == 0)
                break;
            num.add(n);
        }
        if (num.contains(77)) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}








