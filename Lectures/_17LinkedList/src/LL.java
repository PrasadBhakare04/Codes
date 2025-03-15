public class LL {
    private Node head;
    private Node tail;
    //The benefit of taking extra variable tail is that
    //You can insert the value at the end in constant time complexity
    //Because you don't need to traverse the list to find the tail of the list
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = null;
        tail = node;
        size += 1;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }

    public int getSize(){
        return this.size;
    }

    public int deleteFirst(int index){
        Node temp = head;
        int deletedValue = temp.value;
        if(index == 0){
            head = head.next;
            size --;
        }
        return deletedValue;
    }

    public int deleteLast(){
        if(size == 0){
            System.out.println("the list is empty");
            return 0;
        }
        Node secondLast = getNode(size - 2);
        int deletedValue = tail.value;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return deletedValue;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst(index);
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = getNode(index - 1);
        int deletedValue = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return deletedValue;
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insertRec(int val, int index){
        this.head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            this.size ++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }


    public void bubbleSort(int row, int col){
        if(row == 0){
            return;
        }
        if(row > col){ 
            Node first = getNode(col);
            Node second = getNode(col + 1);

            if(second != null && first.value > second.value){
                //swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail){
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
        else{
            bubbleSort(row - 1 , 0);
        }
    }

    public void reverseRec(Node node){
        if(node == tail){
            this.head = this.tail;
            return;
        }
        reverseRec(node.next);
        this.tail.next = node;
        this.tail = node;
        this.tail.next = null;

    }

    public void rotate(int k){
        int tempSize = 0;
        if (this.head == null){
            return;
        }
        Node temp = this.head;
        while(temp != null){
            tempSize += 1;
            temp = temp.next;
        }

        for (int i = 1; i <= k; i++) {
            Node secondLast = this.head;
            for (int j = 1; j < tempSize - 1; j++) {
                secondLast = secondLast.next;
            }
            Node Last = secondLast.next;
            secondLast.next = null;
            Last.next = this.head;
            this.head = Last;
        }

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
