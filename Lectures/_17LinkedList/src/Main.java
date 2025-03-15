
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(65);
        list.insertFirst(56);
        list.insertFirst(57);
        list.insert(55,1);
        list.insertRec(89,1);
        list.display();
        System.out.println(" ");
        list.bubbleSort(list.getSize(), 0);
        list.display();
//        DLL list = new DLL();
//        list.insertFirst(45);
//
//        list.insertFirst(46);
//        list.insertLast(88);
//        list.insertFirst(48);
//        list.insertAfter(46, 70);
//        list.display();
//        System.out.println(" ");
//        System.out.println(list.getTail());
//        System.out.println(list.getHead());


//        CLL list = new CLL();
//        list.insertFirst(45);
//        list.insertFirst(46);
//        list.insertFirst(48);
//        list.display();
//        System.out.println();
//        list.delete(45);
//        System.out.println("Tail is at");
//        list.getTail();
//        System.out.println("******");
//        list.display();
    }
}