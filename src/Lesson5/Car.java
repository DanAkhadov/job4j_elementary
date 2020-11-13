package Lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    int gas(int yourSpeed) {
        speed += yourSpeed;
        return speed;
    }

    int brake(int yourSpeed) {
        speed -= yourSpeed;
        gas(100);
        return speed;
    }

    void information() {
        System.out.println("color: " + color + "\nengine: " + engine + "\nspeed: " + speed);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 130;
        myCar.engine = "V5";
        myCar.color = "red";

        myCar.information();

        myCar.gas(20);
        myCar.information();

        myCar.brake(100);
        myCar.information();

    }
}
