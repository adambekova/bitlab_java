package WhileFor;
import java.util.Scanner;

public class pr11 {
    public class px10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for (int i = 1; i <= n; i = i + 1) {
                if (n % i == 0)
                    System.out.print(i + " ");
            }
        }
    }
}
