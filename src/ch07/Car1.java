package ch07;

public class Car1 {
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brr~");
    }
    void stop(){
        System.out.println("stop!");
    }
}

class FireEngine1 extends Car1{
    void water(){
        System.out.println("water!!");
    }
}


