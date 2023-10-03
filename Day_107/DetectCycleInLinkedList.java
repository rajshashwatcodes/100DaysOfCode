class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DetectCycleInLinkedList {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle in an empty list or a single-element list.
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // Move one step at a time.
            fast = fast.next.next; // Move two steps at a time.

            if (slow == fast) {
                return true; // Cycle detected.
            }
        }

        return false; // No cycle detected.
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next; // Creating a cycle

        boolean result = hasCycle(head);
        if (result) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
