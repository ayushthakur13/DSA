class Node{
        
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class traversal {

    //printing
    static void printLL(Node head){
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //length
    static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
    
    //searching
    static boolean checkifPresent(Node head, int x) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == x)
                return true;  

            temp = temp.next;
        }

        return false; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);

        printLL(head);
        System.out.println();

        System.out.println("Length = "+lengthOfLL(head));

        int val = 3;
        System.out.print(checkifPresent(head, val));
    }
}
