package ObrabotkaOshibok;

public class Worker {

    String name;
    String surname;

    public Worker() {
        name = "no name";
        surname = "surname";
    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public String getData() {
        return name + surname;
    }
}


