package Main.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        list = sort(list);
        System.out.println();
        System.out.println("Sorted first array:");
        for (Integer list1 : list) {
            System.out.print(list1 + " ");
        }
        //System.out.println();

        int m = in.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list2.add(in.nextInt());
        }
        list2 = sort(list2);
        System.out.println("Sorted second array:");
        for (Integer listn : list2) {
            System.out.print(listn + " ");
        }
        // System.out.println();


        ArrayList<Integer> List = new ArrayList<>();
        List.addAll(list);
        List.addAll(list2);


        List = sort(List);
        System.out.println();
        System.out.println("Sorted third array:");
        for (Integer List1 : List) {
            System.out.print(List1 + " ");
        }
        //System.out.println();
    }


    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int index = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    index = j;
                }
            }
            int x = list.get(index);
            list.set(index, list.get(i));
            list.set(i, x);
        }
        return list;
    }
}
