package Abstrakcia;

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Chocolate cholates1 = new Chocolate(in.next(), in.nextInt());
        Chocolate cholates2 = new Chocolate(in.next(), in.nextInt());
        Burger burgers1 = new Burger(in.next(), in.nextInt(), in.nextInt());
        Burger burgers2 = new Burger(in.next(), in.nextInt(), in.nextInt());
        Coke cokes1 = new Coke(in.next(), in.nextDouble(), in.nextBoolean());
        Coke cokes2 = new Coke(in.next(), in.nextDouble(), in.nextBoolean());

        Food food[] = {cholates1, cholates2, burgers1, burgers2,cokes1,cokes2};

        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i].name + " - > " + food[i].getCalories());
            double max=0;
            if (food[i].getCalories()>max){
                max=food[i].getCalories();
                food[i].getName();
            }
            System.out.println("The most high-calorie is " +food[i].getName()+" "+"->"+" "+ max);
        }
    }
}
