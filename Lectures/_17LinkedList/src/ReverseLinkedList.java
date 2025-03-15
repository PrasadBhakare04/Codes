//public class ReverseLinkedList {
//    public static void main(String[] args) {
//
//    }
//    static void reverse(Node node){
//        if(node == head){
//            head = tail;
//            return;
//        }
//        reverse(node.next);
//        tail.next = node;
//        tail = node;
//        tail.next = null;
//    }
//
//    static void reverseLoop(Node node){
//        if(node == null || node.next == null){
//            return node;
//        }
//        Node current = head;
//        Node prev = null;
//        Node next = node.next;
//        while(current != null){
//            current.next = prev;
//            prev = current;
//            current = next;
//            if(next != null){
//                next = next.next;
//            }
//        }
//        return prev;
//    }
//
//    static void reversePart(Node node, int left, int right){
//        if(head == null || left == right){
//            return head;
//        }
//        Node present = head;
//        Node prev = null;
//
//        for (int i = 0; current != null && i < left - 1; i++) {
//            prev = current;
//            current = current.next;
//        }
//        Node newEnd = current;
//        Node last = prev;
//        Node next = present.next;
//        for (int i = 0; current != null && i < right - left + 1; i++) {
//            current.next = prev;
//            prev = current;
//            current = next;
//            if(next != null){
//                next = next.next;
//            }
//        }
//        newEnd.next = current;
//        if(last != null){
//            last.next = prev;
//        }
//        else {
//            head = prev;
//        }
//    }
//}
