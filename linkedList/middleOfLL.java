public class middleOfLL {

    static Node middleNode(Node head) {
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        
        Node head = null;
        
        middleNode(head);
    }
}
