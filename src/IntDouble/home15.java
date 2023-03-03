package IntDouble;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;
public class home15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hislo = n%100;
        int ost = hislo%10;
        int des = (hislo-ost)/10;
        System.out.println(ost);
        System.out.println(des);
    }

}
