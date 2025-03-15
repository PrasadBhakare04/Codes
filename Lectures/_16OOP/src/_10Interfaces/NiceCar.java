package _10Interfaces;

public class NiceCar {
    private Engine engine = new PowerEngine();
    private Media player = new CDplayer();
    public void startEngine(){
        engine.start();
    }
    public void startMusic(){
        player.start();
    }

    void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}

