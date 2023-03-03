import java.util.Scanner;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];

    public OlympicGames() {

        String city = "no city";
        int year = 0;
        sportsmansList = null;
    }

    public OlympicGames(String city, int year, Sportsman sportsmansList[]) {

        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

    public String play() {
        return city + year + sportsmansList;
    }
}

class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gymnast gymnast1 = new Gymnast();
        gymnast1.fullName = in.next();
        gymnast1.age = in.nextInt();
        gymnast1.country = in.next();
        gymnast1.height = in.nextInt();
        gymnast1.weight = in.nextInt();
        gymnast1.style = in.next();

        Gymnast gymnast2 = new Gymnast();
        gymnast2.fullName = in.next();
        gymnast2.age = in.nextInt();
        gymnast2.country = in.next();
        gymnast2.height = in.nextInt();
        gymnast2.weight = in.nextInt();
        gymnast2.style = in.next();

        Footballer footballer1 = new Footballer();
        footballer1.fullName = in.next();
        footballer1.age = in.nextInt();
        footballer1.country = in.next();
        footballer1.club = in.next();
        footballer1.position = in.next();

        Footballer footballer2 = new Footballer();
        footballer2.fullName = in.next();
        footballer2.age = in.nextInt();
        footballer2.country = in.next();
        footballer2.club = in.next();
        footballer2.position = in.next();

        Swimmer swimmer1 = new Swimmer();
        swimmer1.fullName = in.next();
        swimmer1.age = in.nextInt();
        swimmer1.country = in.next();
        swimmer1.style = in.next();
        swimmer1.recordTime = in.nextDouble();

        Swimmer swimmer2 = new Swimmer();
        swimmer2.fullName = in.next();
        swimmer2.age = in.nextInt();
        swimmer2.country = in.next();
        swimmer2.style = in.next();
        swimmer2.recordTime = in.nextDouble();

        Sportsman sportsman[] = {footballer1, footballer2, gymnast1, gymnast2, swimmer1, swimmer2};

        OlympicGames olympicGames = new OlympicGames(in.next(), in.nextInt(), sportsman);

        System.out.println("City: " + olympicGames.city + " Year: " + olympicGames.year);
        for (int i = 0; i < sportsman.length; i++) {
            System.out.println(sportsman[i].play());
        }
    }
}
