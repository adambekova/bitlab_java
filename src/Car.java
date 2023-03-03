import java.util.Scanner;

public class Car {


    String name = "no name";
    String model = "no model";
    int maxSpeed = 0;
    int year = 0;
    double volume = 0.0;

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public Car() {

    }

    public String ride() {
        return "Car" + " " + name + " " + model + " " + "with" + " " + "max" + " " + "speed" + " " + maxSpeed + " " + "km/h" + " " + "from" + " " + year + " " + "year" + " " + "with" + " " + "engine" + " " + "volume" + " " + volume + " " + "liters" + " " + "is" + " " + "riding" + ".";
    }
}


class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Toyota toyota1 = new Toyota();
        toyota1.name = in.next();
        toyota1.model = in.next();
        toyota1.maxSpeed = in.nextInt();
        toyota1.year = in.nextInt();
        toyota1.volume = in.nextDouble();
        toyota1.manufacturer = in.next();

        Toyota toyota2 = new Toyota();
        toyota2.name = in.next();
        toyota2.model = in.next();
        toyota2.maxSpeed = in.nextInt();
        toyota2.year = in.nextInt();
        toyota2.volume = in.nextDouble();
        toyota2.manufacturer = in.next();

        Mercedes mersedes1 = new Mercedes();
        mersedes1.name = in.next();
        mersedes1.model = in.next();
        mersedes1.maxSpeed = in.nextInt();
        mersedes1.year = in.nextInt();
        mersedes1.volume = in.nextDouble();
        mersedes1.classType= in.next();

        Mercedes mersedes2 = new Mercedes();
        mersedes2.name = in.next();
        mersedes2.model = in.next();
        mersedes2.maxSpeed = in.nextInt();
        mersedes2.year = in.nextInt();
        mersedes2.volume = in.nextDouble();
        mersedes2.classType= in.next();


        Car car1 = new Car();
        car1.name = in.next();
        car1.model = in.next();
        car1.maxSpeed = in.nextInt();
        car1.year = in.nextInt();
        car1.volume = in.nextDouble();

        Car car2 = new Car();
        car2.name = in.next();
        car2.model = in.next();
        car2.maxSpeed = in.nextInt();
        car2.year = in.nextInt();
        car2.volume = in.nextDouble();

        Car[]cars={toyota1,toyota2,mersedes1,mersedes2,car1,car2};

        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i].ride());
        }
    }
}

