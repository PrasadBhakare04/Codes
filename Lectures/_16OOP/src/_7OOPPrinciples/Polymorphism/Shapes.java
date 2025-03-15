package _7OOPPrinciples.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }
}
class Triangle extends Shapes{
    void area(){
        System.out.println("Area of triangle is 1/2 * b * h");
    }
}
class Circle extends Shapes{
    void area(){
        System.out.println("Area of Circle is pie * r * r");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("Area of Square is l * l");
    }
}
