package LinkedListJava;
public class SinglyLinkedListCreation {
    Node head; // head of the list

    // Node class (inner class) to represent each element in the list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertValueAtEnd(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void printLinkedList(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void insertValueAtStart(int data){
        Node node = new Node(data);
        node.next = head;
        head=node;

    }
    public void insertValueAtAnyPosition(int index,int data){
        Node node = new Node(data);
        // If the index is 0, insert at the start
        if (index == 0) {
            insertValueAtStart(data);
            return;
        }
        Node n = head;
        // Traverse the list to find the node just before the insertion point
        for (int i = 0; i < index - 1; i++) {
            if (n.next == null) {
                throw new IndexOutOfBoundsException("Index is out of bounds for the linked list.");
            }
            n = n.next;
        }
        // Insert the new node
        node.next = n.next;
        n.next = node;
    }
    public void deleteAt(int index){
        if (index == 0) {
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            // Traverse the list to find the node just before the insertion point
            for (int i = 0; i < index - 1; i++) {
                if (n.next == null) {
                    throw new IndexOutOfBoundsException("Index is out of bounds for the linked list.");
                }
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("deleting at position of "+ index+ ": " + n1.data);
            n1 = null;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedListCreation linkedList = new SinglyLinkedListCreation();
        linkedList.insertValueAtEnd(18);
        linkedList.insertValueAtEnd(12);
        linkedList.insertValueAtEnd(14);
        linkedList.insertValueAtStart(15);
        linkedList.insertValueAtAnyPosition(1,16);
        linkedList.printLinkedList();
        linkedList.deleteAt(2);
        linkedList.printLinkedList();

    }
}
