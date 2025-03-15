package Queue;

public class CircularQueue {
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private int front = -1;
    private int end = -1;
    private int[] data;

    public CircularQueue(int size){
        data = new int[size];
    }
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public void insert(int value){
        if(size == data.length){
            System.out.println("The queue is full");
            return;
        }
        front = 0;
        end++;
        end = end % data.length;
        data[end] = value;
        size++;
    }

    public int remove(){
        if(end == -1){
            System.out.println("The queue is empty");
            return 0;
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display(){
        if(end == -1){
            System.out.println("Empty");
            return;
        }
        int i = front;
        int count = size;
        while (count > 0) {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
            count--;
        }
        System.out.println();
    }
}
