package Main.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int x = in.nextInt();
            if (x == 0) break;
            nums.add(x);
        }
        LinkedHashSet<Integer> notUniq = new LinkedHashSet<>();
        HashSet<Integer> uniq = new HashSet<>();
        for (Integer current : nums) {
            if (uniq.contains(current)) {
                notUniq.add(current);
            }else{
                uniq.add(current);
            }
        }
        for (Integer x : notUniq) {
            System.out.print(x + " ");
        }
    }
}
