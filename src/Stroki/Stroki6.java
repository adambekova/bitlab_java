package Stroki;

import java.util.Scanner;

public class Stroki6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String symbol = in.next();

        int index=str.indexOf(symbol);
        if (index != -1) {
            System.out.print(index);
        } else {
            System.out.print("THERE IS NO SUCH LETTER");
        }
    }
}









