package WhileFor;


import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        double sum = 0.0;
              while (n!=0) {
            count = count+1;
            sum = (sum+n);
            n = in.nextInt();
        }
        if (sum%count == 0)
            System.out.println((int)sum/count);
                    if (sum%count != 0)
                System.out.println(sum / count);

    }

}