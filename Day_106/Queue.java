import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Create a queue using a LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add) elements to the queue
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Peek at the front element without removing it
        String front = queue.peek();
        System.out.println("Front element: " + front);

        // Dequeue (remove) elements from the queue and print them
        System.out.println("Dequeue: " + queue.poll());
        System.out.println("Dequeue: " + queue.poll());

        // Enqueue more elements
        queue.offer("David");
        queue.offer("Eve");

        // Dequeue the remaining elements and print them
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("Dequeue: " + element);
        }
    }
}
