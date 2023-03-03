package Abstrakcia4;

public class Student extends User {
    String name;

    String surname;

    String group;

    double gpa;

    public Student() {
        super();
        String name = "no name";
        String surname = "no surname";
        String group = "no group";
        double gpa=0.0;
    }

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
public String getSurname(){
        return surname;
}
public String getGroup(){
        return group;
}
public double getGpa(){
        return gpa;
}

public void setName(String name){
        this.name=name;
}
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setGroup(String group) {
        this.group=group;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getUserData() {
        return "ID:" + " " + id +" "+ "LOGIN:" + " " +login +" "+ "PASSWORD:" +" "+password+" "+"NAME:"+" "+name+" "+"SURNAME:"+" "+surname+" "+"GROUP:"+" "+group+" "+"GPA:"+" "+gpa;
    }
}
