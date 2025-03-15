package Queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
//        queue.display();

        queue.remove();
        queue.display();
    }
}
