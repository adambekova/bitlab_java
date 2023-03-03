package Jenerik;

import java.util.Scanner;

public class MainPrinter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Printer<Integer> printer = new Printer<>(Integer.class);
        printer.setValue(in.nextInt());
        printer.printValue();
    }
}


class Printer<T> {
         private T value;

    public Printer(Class<T> integerClass) {

    }


    public void setValue (T value){
            this.value = value;
        }
        public T getValue () {
                 return value;
        }
        void printValue () {
            System.out.println("Value is " + value);
        }
        void refresh () {
            System.out.println();
        }
    }

