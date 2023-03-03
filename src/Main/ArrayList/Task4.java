package Main.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int count = 0;
        for (Integer coun:list) {
            if (coun > 0) {
                count++;
            }
        }
        System.out.println(count + " ");
    }
}
