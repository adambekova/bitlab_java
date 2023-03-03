package Massiv;

import java.util.Arrays;
import java.util.Scanner;

public class massiv3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int element = in.nextInt();
        int [] index = new int[element];
        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
        }
        for (int i = 0; i < index.length; i++){
                System.out.println(i + " - " + index[i]);

        }
    }
}
