package StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        System.out.println(nums.stream().reduce(0,(x,sum)->x+sum));
    }
}
