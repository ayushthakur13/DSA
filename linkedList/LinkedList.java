class Node{
        
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {

    static Node head = null;
    static int size = 0;

    static Node insertAtHead(Node head, int data){

        Node newHead = new Node(data, head);
        size++;

        return newHead;
    }

    static Node insertAtTail(Node head, int data){

        if(head == null) {
            size++;
            return new Node(data);
        }
        
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        temp.next = newNode;
        size++;

        return head;        
    }

    static Node insertAtPosition(Node head, int data, int k){

        if(head == null){
            if(k == 1) {
                size++;
                return new Node(data);
            }
            else return null;
        }

        if(k == 1) {
            size++;
            return new Node(data, head);
        }

        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;

            if(count == k-1){
                Node newNode = new Node(data, temp.next);
                temp.next = newNode;
                size++;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    static Node insertBeforeValue(Node head, int data, int val){

        if(head == null) return null;

        if(head.data == val) {
            size++;
            return new Node(data, head);
        }

        Node temp = head;

        while(temp.next != null){

            if(temp.next.data == val){
                Node newNode = new Node(data, temp.next);
                temp.next = newNode;
                size++;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    static Node deleteHead(Node head){
        
        if (head == null || head.next == null) return null;
        
        head = head.next;
        size--;

        return head;
    }

    static Node deleteTail(Node head){

        if (head == null || head.next == null) return null;

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        size--;

        return head;
    }

    static Node deletePosition(Node head, int k){

        if(head == null) return null;
        
        if(k == 1){
            head = head.next;
            size--;
            return head;
        } 

        int count = 0;
        Node temp = head;

        while(temp.next != null){
            count++;

            if(count == k-1) {
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    static Node deleteValue(Node head, int val){

        if(head == null) return null;

        if(val == head.data){
            head = head.next;
            size--;
            return head;
        } 

        Node temp = head;

        while(temp.next != null){

            if(temp.next.data == val){
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
        }

        return head;        
    }

    static int getSize(){
        return size;
    }

    static void printLL(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
         // start with an empty list

        // Insert at head
        head = insertAtHead(head, 30);  // List: 30
        head = insertAtHead(head, 20);  // List: 20 -> 30
        head = insertAtHead(head, 10);  // List: 10 -> 20 -> 30

        // Insert at tail
        head = insertAtTail(head, 40);  // List: 10 -> 20 -> 30 -> 40
        head = insertAtTail(head, 50);  // List: 10 -> 20 -> 30 -> 40 -> 50

        // Insert at position
        head = insertAtPosition(head, 25, 3);  // List: 10 -> 20 -> 25 -> 30 -> 40 -> 50

        // Insert before a value
        head = insertBeforeValue(head, 35, 40);  // List: 10 -> 20 -> 25 -> 30 -> 35 -> 40 -> 50

        // Delete head
        head = deleteHead(head);  // List: 20 -> 25 -> 30 -> 35 -> 40 -> 50

        // Delete tail
        head = deleteTail(head);  // List: 20 -> 25 -> 30 -> 35 -> 40

        // Delete at position
        head = deletePosition(head, 3);  // List: 20 -> 25 -> 35 -> 40

        // Delete by value
        head = deleteValue(head, 25);  // List: 20 -> 35 -> 40

        System.out.print("Final Linked List : ");
        printLL(head);

        System.out.println("Size of Linked List = " + getSize());
    }    
}
