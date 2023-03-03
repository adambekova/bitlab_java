package Stroki;
import java.util.Scanner;

public class Stroki23 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A'&&str.charAt(i)<='Z' || str.charAt(i)>='a'&&str.charAt(i)<='z') {
                sum++;
            }
        }
        System.out.print(sum);
    }
}
