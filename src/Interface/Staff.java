package Interface;

public class Staff implements Workers {
    int id;
    String name;
    String surname;
    int salary;

    public Staff() {
        id = 0;
        name = "no name";
        surname = "no surname";
        salary = 0;
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID:" + " " + id + " " + "NAME:" + " " + name + " " +"SURNAME:"+" "+surname+ " " + "SALARY:" + " " + salary;
    }
}

class HRManagers implements Workers {
    int id;
    String fullName;
    int salary;

    public HRManagers() {
        id = 0;
        fullName = "no fullName";
        salary = 0;
    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID:" + " " + id + " " + "FULL NAME:" + " " + fullName;
    }
}


class Programmers implements Workers {
    int id;
    String nickname;
    int salary;
    int bonusSalary;
    double KPIValue;

    public Programmers() {
        int id = 0;
        String nickname = "no nickname";
        int salary = 0;
        int bonusSalary = 0;
        double KPIValue = 0;
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue * bonusSalary);
    }

    public String getWorkerData() {
        return "ID:" + " " + id + " " + "NICKNAME:" + " " + nickname +" " + "SALARY:" + " "+salary+ " "+"BONUS SALARY:"+" "+bonusSalary+" "+"KPI VALUE:"+" "+KPIValue;
    }
}