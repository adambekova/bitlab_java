package Jenerik;

import java.util.Scanner;

public class MainSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Swap<Integer, String> swap = new Swap<>(in.nextInt(), in.next());
        swap.swap();
    }
}
class Swap<A, B> {
    private A first;
    private B second;
    public Swap() {

    }
    public Swap(A first, B second) {
        this.first=first;
        this.second=second;
    }
    public void setFirst(A first) {
        this.first = first;
    }
    public void setSecond(B second) {
        this.second = second;
    }
    public B getSecond() {
        return second;
    }
    public A getFirst() {
        return first;
    }
    public void swap() {
        System.out.println(second);
        System.out.println(first);
    }
}
