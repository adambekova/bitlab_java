package IntDouble;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;
public class home5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = (3 * (x * x)) - (6 * x) - 7;
        System.out.println(sum);
    }
}
