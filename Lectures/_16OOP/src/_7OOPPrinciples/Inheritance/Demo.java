package _7OOPPrinciples.Inheritance;

public class Demo {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight(60);
        System.out.println(box.h);
    }
}
class Box{
    int l;
    int w;
    int h;
//    Box(){}
    Box(int l, int h, int w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
}
class BoxWeight extends Box {
    int weight;
    BoxWeight(int weight){
        super(-1,-1,-1);
        this.weight = weight;
    }
}

