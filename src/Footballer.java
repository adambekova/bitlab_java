import java.util.Scanner;
public class Footballer extends Sportsman {
    String position;
    String club;

    public Footballer() {
        super();
        String position = "no position";
        String club = "no club";
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String play() {
        return "Footballer" + " " + fullName + " " + "from" + " " + country + "," + " " + age + " " + "years" + " " + "old" + " " + position + " " + "is" + " " + "playing" + " " + "for" + " " + club;
    }
}