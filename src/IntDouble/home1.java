package IntDouble;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.StringJoiner;

public class home1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String surname = in.next();
        String age = in.next();
        String country = in.next();
        System.out.println("Name: " +name);
        System.out.println("Surname: " +surname);
        System.out.println("Age: " +age);
        System.out.println("Country: " +country);


    }
}