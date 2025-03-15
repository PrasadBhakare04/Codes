package _10Interfaces;

public class Main{
    public static void main(String[] args) {
//        Car car = new Car();
        NiceCar car = new NiceCar();
        car.startEngine();
        car.startMusic();
        car.upgradeEngine();
        car.startEngine();
    }
}
