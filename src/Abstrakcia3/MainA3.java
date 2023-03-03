package Abstrakcia3;

import java.util.Scanner;

public class MainA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        FerrariEngine fer1 = new FerrariEngine(in.nextDouble(), in.nextInt(), in.nextDouble());
        FerrariEngine fer2 = new FerrariEngine(in.nextDouble(), in.nextInt(), in.nextDouble());

        RenaultEngine ren1 = new RenaultEngine(in.nextDouble(), in.nextInt(), in.nextDouble(), in.nextDouble());
        RenaultEngine ren2 = new RenaultEngine(in.nextDouble(), in.nextInt(), in.nextDouble(), in.nextDouble());

        Engine engines[] = {fer1, fer2, ren1, ren2};

        for (int i = 0; i < engines.length; i++) {
            System.out.println("Received maximum speed: " + engines[i].getMaxSpeed());
        }
    }
}
