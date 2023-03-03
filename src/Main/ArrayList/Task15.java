package Main.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> str = new HashSet<>();
        while (true) {
            String n = in.next();
            if (n.equals("stop"))
                break;
            str.add(n);
        }
        int sum=0;
        for (String elem:str){
            sum=elem.length()+sum;
        }
        System.out.println(sum);
    }
}
