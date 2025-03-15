package _8AccessModifiers.Package2;

import _8AccessModifiers.Package1.FromPackage1;

public class SubClass extends FromPackage1 {
    SubClass ob1 = new SubClass();
//    int a = ob1.num;
}
class NotSubClass{
    NotSubClass obj1 = new NotSubClass();
//    obj1.num;
}