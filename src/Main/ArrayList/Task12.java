package Main.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> num = new HashSet<>();
        int sum=0;
               for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            num.add(n);
               }
               for (Integer n:num){

            sum=sum+n;
                  }
            System.out.print(sum);
        }
    }


