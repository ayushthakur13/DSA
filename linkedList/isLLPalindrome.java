public class isLLPalindrome{

    static boolean checkLLIsPalindrome(Node head){

        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node firstHalf = head;
        Node secondHalf = reverse(slow);

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    static Node reverse(Node head) {

        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        
        Node head = null;

        checkLLIsPalindrome(head);
    }
}
