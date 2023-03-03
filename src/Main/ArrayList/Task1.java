package Main.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        for (Integer elem:list){
            System.out.print(elem/2+" ");
        }
    }
}
