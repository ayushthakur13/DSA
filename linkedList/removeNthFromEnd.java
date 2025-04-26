public class removeNthFromEnd {

    static Node removeNthNodeFromEndOfLL(Node head, int n){

        Node slow = head;
        Node fast = head;

        for(int i=0; i<n; i++) fast = fast.next;
        
        if(fast == null) return head.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        
        Node head = null;
        int n = 2;

        removeNthNodeFromEndOfLL(head, n);
    }
}
