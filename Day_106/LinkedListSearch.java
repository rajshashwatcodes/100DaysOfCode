class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListSearch {

    public static boolean search(ListNode head, int target) {
        ListNode current = head;

        while (current != null) {
            if (current.val == target) {
                return true; // Found the target value in the linked list.
            }
            current = current.next; // Move to the next node.
        }

        return false; // Target value not found in the linked list.
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int target = 3;
        boolean result = search(head, target);
        if (result) {
            System.out.println("Found " + target + " in the linked list.");
        } else {
            System.out.println(target + " not found in the linked list.");
        }
    }
}
