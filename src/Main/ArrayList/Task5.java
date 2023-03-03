package Main.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0; i<n; i++){
        num.add(in.nextInt());
    }
        int sum=0;
    for (int i=0; i< num.size();i++){
        if(l<=i && i<=r)
            sum=sum+num.get(i);
    }
        System.out.println(sum+" ");
    }
}
