package Classiobject;

import javax.xml.namespace.QName;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
        id = 0;
        name = "no name";
        surname = "no surname";
        gpa = 0;
    }

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData() {
        return "ID: " + id + " Full" + " Name: " + name + " " + surname + " GPA: " + gpa;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Student[] students = new Student[3];
//        for (int i = 0; i < 3; i++) {
//            students[i] = new Student();
//            students[i].id = in.nextInt();
//            students[i].name = in.next();
//            students[i].surname = in.next();
//            students[i].gpa = in.nextDouble();
//        }
//        for (int i = 0; i < 3; i++) {
//            students[i].getStudentData();
//            System.out.println(students[i].getStudentData());
//        }
//    }
//
//    public static Student topStudent(Student students[]) {
//        Student max = students[0];
//        for (int i = 0; i < 3; i++) {
//            if (students[i].gpa > max.gpa) {
//                max = students[i];
//
//            }
//        }
//        return max;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Student[] students = new Student[100];
//        int size = 0;
//        int id = 0;
//
//        while (true){
//            System.out.println("PRESS [1] TO ADD STUDENT");
//            System.out.println("PRESS [2] TO LIST STUDENT");
//            System.out.println("PRESS [0] TO EXIT");
//            int choice = in.nextInt();
//
//            if (choice == 1){
//                id++;
//                System.out.println("Insert name?");
//                String name = in.next();
//                System.out.println("Insert surname?");
//                String surname = in.next();
//                System.out.println("Insert GPA?");
//                double gpa = in.nextDouble();
//                students[size] = new Student(id,name,surname, gpa);
//                size++;
//            }
//            if (choice == 2){
//                for (int i = 0; i < size; i ++){
//                    System.out.println(students[i].getStudentData());
//                }
//            }
//            if (choice == 0){
//                break;
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Player[] players1 = new Player[5];
//        players1[0]=new Player(1, "Leonel","Messi","attack");
//        players1[1]=new Player(2, "Diego","Maradona","aaa");
//        players1[2]=new Player(3, "Ronaldo","Cristiano","abc");
//        players1[3]=new Player(4, "Pele","Pele","abb");
//        players1[4]=new Player(5, "Rayan","Bitclub","hacker");
//
//
//        Player[] players2 = new Player[5];
//        players2[0]=new Player(1, "Zinedine","Zidane","aaa");
//        players2[1]=new Player(2, "Cristiano","Ronaldo","abc");
//        players2[2]=new Player(3, "Kylian","Mbappe","attack");
//        players2[3]=new Player(4, "Ferland","Mendy","defender");
//        players2[4]=new Player(5, "Karim","Benzema","attack");
//
//
//        Club club1 = new Club("barsa", "Spain",100, players1);
//        Club club2 = new Club("real madrid", "Spain",88, players2);
//
//        Club[] clubs = {club1, club2};
//
//        for (int i = 0; i < clubs.length; i++) {
//            clubs[i].printClubData();
//        }
//    }
//}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone[] phones = new Phone[10];
        for (int i = 0; i < 10; i++) {
            phones[i] = new Phone();
            phones[i].name = scanner.next();
            phones[i].model = scanner.next();
            phones[i].price = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (phones[i].equals("TOP") && phones[i].equals("SIMPLE")) {
                phones[i].getData();

                System.out.println(phones[i].getData());
            }
        }
    }
}
