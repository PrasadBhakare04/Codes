public class DLL {
    private int size;
    private Node head;
    private Node tail;

    public DLL(){
        this.size = 0;
    }

    public int getTail() {
        return tail.value;
    }

    public int getHead(){
        return head.value;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        else{
            tail = node;
        }
        head = node;
        size++;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        tail = node;
        size ++;
    }

    private Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            else{
                temp = temp.next;
            }
        }
        return null;
    }
    public void insertAfter(int after, int value){
        Node p = find(after);
        if(p == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
            size++;
            return;
        }
        tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    private class Node{
        public int value;
        public Node next;
        public Node prev;

        public Node (int value){
            this.value = value;
        }
    }
}
