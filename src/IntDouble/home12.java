package IntDouble;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;

public class home12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = a%10;
        int sum2 = (a-sum)/10;
        System.out.println(sum2);
        System.out.println(sum);
    }
}
