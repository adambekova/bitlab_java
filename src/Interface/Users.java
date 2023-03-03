package Interface;

public class Users {

    String name;
    String surname;

    public Users(){
        name = "no name";
        surname = "no surname";
    }

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
