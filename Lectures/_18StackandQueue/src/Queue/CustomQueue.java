package Queue;

public class CustomQueue {
    private static final int DEFAULT_SIZE = 10;
    private int end = -1;
    private int[] data;
    CustomQueue(){
        data = new int[DEFAULT_SIZE];
    }
    CustomQueue(int size){
        data = new int[DEFAULT_SIZE];
    }

    public void insert(int value){
        if(isFull()){
            System.out.println("The Queue is full");
            return;
        }
        end += 1;
        data[end] = value;
    }

    public void remove(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return;
        }
        System.out.println(data[end]);
        end -= 1;
    }

    public void display(){
        for (int i = 0; i <= end; i++) {
            System.out.println(data[i]);
        }
    }

    private boolean isEmpty(){
        if(end == -1) {
            return true;
        }
        return false;
    }
    private boolean isFull(){
        if(end == data.length -1){
            return true;
        }
        return false;
    }
}
