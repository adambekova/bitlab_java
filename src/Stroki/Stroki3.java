package Stroki;
import java.util.Scanner;

public class Stroki3 {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        String str1 = "BITLAB";
        String str2 = in.next();

        if(str1.equals(str2)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
