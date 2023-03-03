package Main.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        while (true) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            list.add(n);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j <= list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(list.get(i) + " ");
            }
            count = 0;
        }
    }
}
