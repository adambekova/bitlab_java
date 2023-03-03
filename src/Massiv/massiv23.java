package Massiv;

import java.util.Scanner;

public class massiv23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        int[] average = new int[score];
        float min;
        float max = 0;
        for (int i = 0; i < score; i++) {
            average[i] = in.nextInt();
        }
        float sum = 0;
        float sum1 = 0;
        float count = 0;
        float count1 = 0;
        min = average[0];
        for (int i = 0; i < score; i++) {
            sum = sum + average[i];
            if (average[i] >= max) {
                max = average[i];
            }
            if (average[i] <= min) {
                min = average[i];
            }
        }
        sum1 = sum - (min + max);
        count1 = sum1 / (score-2);
        System.out.println((int) sum1 + " ");
        System.out.println(count1 + " ");
    }
}



