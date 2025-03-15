/*
Abstract methods are the methods which do not contain any body but have return type and arguments same
They are needed to be overridden
Classes which contains abstract methods must be declared as abstract
Abstract classes can have non-abstract methods also
All subclasses should override all the abstract methods i.e we cannot  make a subclass override only
one or two abstract methods OR else they should be itself declared as abstract
Abstract classes can have constructor which should not be abstract
We can call this constructor using super() keyword inside child's constructor
We cannot make final abstract methods, we cannot make abstract static methods
because final methods cannot be inherited and
static methods cannot be overridden and abstract methods are meant to be overridden
Abstract classes can inherit normal classes and also normal classes
*/
package _9Abstraction;
class grand{

}

abstract public class Parent extends grand{
    abstract void printName(String name);
    abstract void printAge(int age);
}

class Son extends Parent{
    @Override
    void printName(String name){
        System.out.println(name);
    }

    @Override
    void printAge(int age){
        System.out.println(age);
    }
}

class Daughter extends Parent{
    @Override
    void printName(String name){
        System.out.println(name);
    }

    @Override
    void printAge(int age){
        System.out.println(age);
    }
}
