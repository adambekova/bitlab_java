package Main.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        while (true) {
            int x = in.nextInt();
            if (x == 0) break;
            nums.add(x);
        }

        for (Integer num : nums) {
            if (num < 0) {
                System.out.print(num + " ");

                num2.add(num);
            }
        }
        int max = num2.get(0);
        for (Integer y : num2) {
            if (max < y) {
                max = y;

            }
        }
        System.out.println();
        System.out.print(max + " ");
    }
}




