package IntDouble;


import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int profit = in.nextInt();
        double month = in.nextDouble();
        double sum = profit/month;
        System.out.println("Company " + name + " earns " + sum + " dollars in a month");
    }
}
