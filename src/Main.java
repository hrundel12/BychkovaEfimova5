// Интерфейс Nameable
interface Nameable {
    String getName();
}

// Интерфейс Priceable
interface Priceable {
    double getPrice();
}

// Класс Planet, реализующий интерфейсы Nameable и Priceable
class Planet implements Nameable, Priceable {
    private String name;
    private double price;

    public Planet(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс Car, реализующий интерфейсы Nameable и Priceable
class Car implements Nameable, Priceable {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс Animal, реализующий интерфейсы Nameable и Priceable
class Animal implements Nameable, Priceable {
    private String name;
    private double price;

    public Animal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Главный класс для проверки работы интерфейсов
public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth", 5.972e24);
        Nameable car = new Car("Tesla Model S", 79999);
        Nameable animal = new Animal("Lion", 15000);

        System.out.println("Planet: " + planet.getName() + ", Price: " + ((Priceable) planet).getPrice());
        System.out.println("Car: " + car.getName() + ", Price: " + ((Priceable) car).getPrice());
        System.out.println("Animal: " + animal.getName() + ", Price: " + ((Priceable) animal).getPrice());
    }
}