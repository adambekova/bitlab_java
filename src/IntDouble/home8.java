package IntDouble;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;
public class home8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        double P = 3.14;
        double R = L/(2*P);
        double S = P*R;
        System.out.println(R + " " + S);
    }

}
