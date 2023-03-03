package Metod;
import java.util.Scanner;
public class Metod14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(check(n));
    }

    public static int check(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                count++;
            }
        }
        return count;
    }
}
