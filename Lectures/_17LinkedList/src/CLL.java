public class CLL {
    private int size;
    private Node head;
    private Node tail;
    public CLL(){
        this.size = 0;
    }

    public void getHead(){
        System.out.println(head.value);
    }

    public void getTail(){
        System.out.println(tail.value);
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            head.next = head;
            tail = node;
            tail.next = head;
            this.size++;
            return;
        }
        tail.next = node;
        node.next = head;
        head = node;
        this.size++;
    }

    public Node find(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void delete(int value){
        if(head.value == value){
            head = head.next;
            tail.next = head;
            this.size--;
            return;
        }
        if(tail.value == value){
            Node secondLast = find(size - 2);
            tail = secondLast;
            tail.next = head;
            this.size--;
            return;
        }
        Node temp = head;
        for (int i = 0; i < this.size -2; i++) {
            if(temp.next.value == value){
                temp.next = temp.next.next;
                size--;
            }
            temp = temp.next;
            return;
        }
    }
    public void display(){
        Node temp = head;
        for (int i = 0; i <= size; i++) {
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
    }
    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
    }
}
