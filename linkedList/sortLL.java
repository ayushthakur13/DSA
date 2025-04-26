public class sortLL{

    static Node sortList(Node head){

        if(head == null || head.next == null) return head;

        Node middle = findMiddle(head);

        Node leftHead = head;
        Node rightHead = middle.next;

        middle.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        
        return merge(leftHead, rightHead);
    }

    static Node merge(Node l1, Node l2){

        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } 
            else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

    static Node findMiddle(Node head){

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        
        Node head = null;

        sortList(head);
    }
}
