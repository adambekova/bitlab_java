package Massiv;

import java.util.Scanner;

public class massiv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] score= new int [size];
        for (int i = 0; i < score.length; i++) {
            score[i] = in.nextInt();
        }
        for (int i = 0; i < score.length; i++)
            System.out.println(score[i]);
    }
}
