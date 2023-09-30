class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Create a dummy node to handle edge cases.
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer n+1 steps ahead.
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end.
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end.
        second.next = second.next.next;

        return dummy.next; // Return the modified head of the list.
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove the 2nd node from the end (4).

        System.out.println("Original List:");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.println("List after removing the " + n + "th node from the end:");
        printList(head);
    }
}
