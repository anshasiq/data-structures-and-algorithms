package linked.list;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;

    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public boolean includes(int find){
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

    void append(int newValue) {
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
    void insertBefore(int targetValue, int newValue) {
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
    void insertAfter(int targetValue, int newValue) {
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

   public int kthFromEnd(int f){
        if(f<0){
            System.out.println("it's negative number");
            return -1;
    }
       Node  current=head;
       int s=1;
    while(current.next!=null) {
        ++s;
    current=current.next;
    }
    int e=s;
    if(f>e-1){
        System.out.println("it's not existing");
        return -1;}
       current=head;
       while(current!=null) {
           --e;
           if(e==f){
        System.out.println(current.data);
        return (current.data);
  }
           current=current.next;
       }

        return 0;
   }



};