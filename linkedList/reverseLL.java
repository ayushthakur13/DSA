public class reverseLL {

    //Iterative way
    static Node reverseList1(Node head) {

        Node temp = head;
        Node prev = null;

        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        
        return prev;
    }

    //Recursive way
    static Node reverseList2(Node head){

        if(head == null || head.next == null) return head;

        Node newHead = reverseList2(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        
        Node head = null;

        reverseList1(head);
        reverseList2(head);
    }
}
