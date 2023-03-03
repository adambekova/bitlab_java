package Stroki;

import java.util.Scanner;

public class Stroki26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[] = in.nextLine().toLowerCase().split(" ");
        String[] str2 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        for (int i = 0; i < str.length; i++) {
            boolean flag = true;
            for (int j = 0; j < str2.length; j++) {
                if (str[i].equals(str2[j])) {
                    System.out.print(j+" ");
                    flag = false;
                }
            }
            if(flag == true){
                System.out.print(str[i]+" ");
            }
        }
    }
}
//Напишите программу которая заменяет цифры прописанные в текстовом виде на числовой формат.