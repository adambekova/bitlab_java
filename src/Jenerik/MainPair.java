package Jenerik;

import java.util.Scanner;

public class MainPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pair<Integer, String> pair = new Pair<>(in.nextInt(), in.next());
        System.out.println("Value -> " + pair.getFirst());
        System.out.println("Value -> " + pair.getSecond());

    }
}

class Pair<A, B> {
    private A first;
    private B second;

    public Pair(){

    }

    public Pair(A first, B second){
        this.first = first;
        this.second = second;
    }
    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
