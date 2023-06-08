public class queue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

    public static class Queue {
        private Node first;
        private Node last;

        public Queue() {
            first = null;
            last = null;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public void enqueue(int data) {
            Node oldLast = last;
            last = new Node(data);
            last.next = null;
            if(isEmpty()) {
                first = last;
            }
            else {
                oldLast.next = last;
            }
        }

        public int dequeue() {
            int data = first.data;
            first = first.next;
            if(isEmpty()) {
                last = null;
            }
            return data;
        }
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
