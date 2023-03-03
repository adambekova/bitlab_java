package Main.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int n = in.nextInt();
            if (n == 0)
                break;
            set.add(n);
        }
        int sum = 0;
        for (Integer i: set) {
            sum = sum+i;
        }

        System.out.print(sum + " ");
    }
}



