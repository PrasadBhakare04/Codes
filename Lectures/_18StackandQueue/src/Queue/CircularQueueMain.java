package Queue;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(5);
        System.out.println(queue.remove());
        queue.display();

    }
}
