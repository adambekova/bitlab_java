package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> foot = new HashMap<>();
        while (foot.size() < 5) {
            foot.put(in.next(), in.nextInt());
        }
            for (String key : foot.keySet()) {
                System.out.println(key + " scored " + foot.get(key) + " goals in EPL");
            }
        }
    }


