public class oddEvenLL {

    static Node oddEvenList(Node head){

        if (head == null || head.next == null) return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
    
    public static void main(String[] args) {
        
        Node head = null;

        oddEvenList(head);
    }
}
