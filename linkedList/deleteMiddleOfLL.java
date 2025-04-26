public class deleteMiddleOfLL {

    static Node deleteMiddle(Node head) {

        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null){
            prev = slow;

            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) prev.next = slow.next;
        
        return head;
    }
    public static void main(String[] args) {
        
        Node head = null;

        deleteMiddle(head);
    }
}
