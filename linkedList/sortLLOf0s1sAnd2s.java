public class sortLLOf0s1sAnd2s {

    static Node sortListOf0s1sAnd2s(Node head){

        if(head == null || head.next == null) return head;

        Node zeroHead = new Node(-1), zero = zeroHead;
        Node oneHead = new Node(-1), one = oneHead;
        Node twoHead = new Node(-1), two = twoHead;

        Node temp = head;

        while(temp != null){
            
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            } 
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            } 

            temp = temp.next;
        }

        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        return zeroHead.next;
    }
    public static void main(String[] args) {
        
        Node head = null;

        sortListOf0s1sAnd2s(head);
    }
}
