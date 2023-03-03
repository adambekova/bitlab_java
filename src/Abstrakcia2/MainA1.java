package Abstrakcia2;

import Abstrakcia2.CubeGold;
import Abstrakcia2.SphereGold;

import java.util.Scanner;

public class MainA1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SphereGold sph1 = new SphereGold(in.nextDouble());
        SphereGold sph2 = new SphereGold(in.nextDouble());

        CubeGold cub1 = new CubeGold(in.nextDouble());
        CubeGold cub2 = new CubeGold(in.nextDouble());

        GoldShape gold[] = {sph1, sph2, cub1, cub2};

        for (int i = 0; i < gold.length; i++) {
           System.out.println(gold[i].getPrice()+" "+"KZT");
        }
    }
}