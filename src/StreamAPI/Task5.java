package StreamAPI;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("mers", 100, 2));
        CarCity cs = new CarCity(cars);
        System.out.println(cs.search("mers"));
    }
}

class Car {
    String name;
    int maxSpeed;
    double engineVolume;

    public Car(String name, int maxSpeed, double engineVolume) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
class CarCity {
    ArrayList<Car> cars = new ArrayList<>();

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    void addCar(Car car) {
        cars.add(car);
    }

    Car firstGreatVolumeCar() {
        return cars.stream().filter(elem -> elem.engineVolume > 3).findFirst().get();
    }

    ArrayList<Car> search(String name) {
        return new ArrayList<Car>(cars.stream().filter(elem -> elem.getName().equals(name)).collect(Collectors.toList()));
    }

    ArrayList<Car> filterCars(int fromSpeed, int toSpeed, double fromVolume, double toVolume) {
        return new ArrayList<Car>(cars.stream().filter(elem -> elem.getMaxSpeed() >= fromSpeed && elem.getMaxSpeed() <= toSpeed && elem.getEngineVolume() >= fromVolume && elem.getEngineVolume() <= toVolume).collect(Collectors.toList()));
    }
}
