public class stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    public static class Stack {
        private Node first;

        public Stack() {
            first = null;
        }

        public boolean isEmpty() {
            return first == null;
        }

        public void push(int data) {
            Node oldFirst = first;
            first = new Node(data);
            first.next = oldFirst;
        }

        public int pop() {
            int data = first.data;
            first = first.next;
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
