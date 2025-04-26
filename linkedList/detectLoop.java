public class detectLoop{

    static boolean detectLoopInLL(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        
        return false;
    }
    public static void main(String[] args) {
        
        Node head = null;

        detectLoopInLL(head);
    }
}
