package Main.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(in.nextInt());
        }

        for (int i = r; i >= l; i--) {
            num.get(i);
            System.out.print(num.get(i) + " ");
        }
    }
}


