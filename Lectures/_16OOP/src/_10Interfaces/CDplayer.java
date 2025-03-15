package _10Interfaces;

public class CDplayer implements Media{
    @Override
    public void start(){
        System.out.println("I start a media player");
    }
    @Override
    public void stop(){
        System.out.println("I stop the media player");
    }
}
