public class lengthOfLoop {

    static int lengthOfLoopInLL(Node head){

        Node slow = head;
        Node fast = head;
        

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int count = 1;
                slow = slow.next;

                while(slow != fast){
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        
        Node head = null;

        lengthOfLoopInLL(head);
    }
}
