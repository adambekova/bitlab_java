import java.util.Scanner;
public class Sportsman {
    String fullName;
    int age;
    String country;

    public Sportsman(){
        String fullName="no fullName";
        int age = 0;
        String country = "no country";
    }
    public Sportsman(String fullName, int age, String country){
        this.fullName=fullName;
        this.age=age;
        this.country=country;
    }
    public String play(){
        return "Sportsman"+" "+fullName+" "+"from"+" "+country+" "+age+" "+"years"+" "+"old"+" "+"is"+" "+"playing";
    }
}
