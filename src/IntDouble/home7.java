package IntDouble;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;
public class home7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = a*b*c;
        int sum2 = 2*(a*b+b*c+a*c);
        System.out.println(sum + " " + sum2);
    }
}
