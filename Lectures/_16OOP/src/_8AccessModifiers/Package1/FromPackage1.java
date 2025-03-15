package _8AccessModifiers.Package1;

public class FromPackage1 {
    int num = 10;
}
class AlsoFromPackage1 extends FromPackage1{
    AlsoFromPackage1 obj = new AlsoFromPackage1();
    int a = obj.num;
}
class insideFile {
    public static void main(String[] args) {
        FromPackage1 obj = new FromPackage1();
        int n = obj.num;
    }
}