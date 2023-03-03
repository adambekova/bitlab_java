import javax.swing.*;
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        User user1 = new User(1, in.next(), in.next(), in.next(), in.next());

        Staff staff1 = new Staff(2, in.next(), in.next(), in.next(), in.next(), in.nextDouble());
        staff1.addSubject(in.next());

        Student student1 = new Student(3, in.next(), in.next(), in.next(), in.next(), in.nextDouble());
        student1.addCourse(in.next());

        User users[] = {user1, staff1, student1};


        for (int i = 0; i < users.length; i++) {
            users[i].getData();
        }
    }
}


class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;

    public User() {
        id = 0;
        login = "no login";
        password = "no password";
        name = "no name";
        surname = "no surname";
    }

    public User(int id, String login, String password, String name, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getData() {
        System.out.println("ID:" + " " + id + " " + "FULL NAME:" + " " + name + " " + surname + " " + "LOGIN:" + " " + login + " " + "PASSWORD:" + " " + password);
    }
}

class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
        super();
        salary = 0;
        indexOfSubject = 0;
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    @Override
    public void getData() {
        System.out.println("ID:" + " " + id + " " + "FULL NAME:" + " " + name + " " + surname + " " + "LOGIN:" + " " + login + " " + "PASSWORD:" + " " + password + " " + "SALARY:" + " " + salary);
        System.out.println("SUBJECTS:");

        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }
}

class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
        super();
        gpa = 0;
        indexOfCourses = 0;
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    @Override
    public void getData() {
        System.out.println("ID:" + " " + id + " " + "FULL NAME:" + " " + name + " " + surname + " " + "LOGIN:" + " " + login + " " + "PASSWORD:" + " " + password + " " + "GPA:" + " " + gpa);
        System.out.println("COURSES:");

        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }
}
