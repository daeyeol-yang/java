package ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Car1 car2 = null;
        FireEngine1 fe=null;

        car.drive();
        fe =(FireEngine1) car;
        fe.drive();
        car2 = fe;
        car2.drive();

    }
}
