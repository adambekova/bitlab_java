import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[100];
        int size = 0;
        int id = 1;
//если правда:
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
     //напечатай мне в консоль:
            int press = in.nextInt();
            // если набрать цифру 1:
            if (press == 1) {
                System.out.println("PRESS [1] TO ADD STUDENT");
                System.out.println("PRESS [2] TO ADD STAFF ");
                int press_1 = in.nextInt();
                if (press_1 == 1) {
                    System.out.println("Login: ");
                    String loginOfStudent = in.next();
                    System.out.println("Password: ");
                    String passwordOfStudent = in.next();
                    System.out.println("Name: ");
                    String nameOfStudent = in.next();
                    System.out.println("Surname: ");
                    String surnameOfStudent = in.next();
                    System.out.println("GPA: ");
                    double gpaOfStudent = in.nextDouble();
                    users[size] = new Student(id, loginOfStudent, passwordOfStudent, nameOfStudent, surnameOfStudent, gpaOfStudent);
                    size++;
                    id++;
                } else if (press_1 == 2) {
                    System.out.println("Login: ");
                    String loginOfStaff = in.next();
                    System.out.println("Password: ");
                    String passwordOfStaff = in.next();
                    System.out.println("Name: ");
                    String nameOfStaff = in.next();
                    System.out.println("Surname: ");
                    String surnameOfStaff = in.next();
                    System.out.println("Salary: ");
                    double salaryOfStaff = in.nextDouble();
                    users[size] = new Staff(id, loginOfStaff, passwordOfStaff, nameOfStaff, surnameOfStaff, salaryOfStaff);
                    size++;
                    id++;
                }
            } else if (press == 2) {
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST STAFF");
                int press_2 = in.nextInt();
                if (press_2 == 1) {
                    for (int i = 0; i < size; i++) {
                        if (users[i] instanceof Student) {
                            users[i].getData();
                        }
                    }
                } else if (press_2 == 2) {
                    for (int i = 0; i < size; i++) {
                        if (users[i] instanceof Staff) {
                            users[i].getData();
                        }
                    }
                }
            } else if (press == 0) {
                break;
            }
        }
    }
}