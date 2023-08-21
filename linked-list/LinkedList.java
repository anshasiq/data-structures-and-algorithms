

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
       
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        newNode.next = head; 
         head = newNode; 
    }
    public boolean includes(String find){
Node current = head; 
    while (current.next!=null)
    {
        if(current.data==find)
        return true;
        current=current.next;
    }
return false;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" } -> { ");
            } else {
                sb.append(" ");
            }
            current = current.next;
        }

        sb.append("} -> NULL");
        return sb.toString();
    }

    void append(String newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void insertBefore(String targetValue, String newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = newNode;
            return;
        }

        if (head.data == targetValue) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != targetValue) {
            current = current.next;
        }

        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    void insertAfter(String targetValue, String newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {

            head = newNode;
            return;
        }

        Node current = head;
        while (current != null && current.data != targetValue) {
            current = current.next;
        }

        if (current != null) {

            newNode.next = current.next;
            current.next = newNode;
        }
    }

};