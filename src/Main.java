
import javax.print.DocFlavor;
import java.awt.*;
import java.time.Year;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "abc";
        for (int i = str.length() - 1; i >= 0; i--) {
            str.charAt(i);
            System.out.print(str.charAt(i));
        }
    }
}