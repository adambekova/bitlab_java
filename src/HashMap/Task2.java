package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> foot = new HashMap<>();
        for (int i=0; i<5;i++) {
            foot.put(in.next(), in.nextInt());
        }
        System.out.println(foot.size());
    }
}

