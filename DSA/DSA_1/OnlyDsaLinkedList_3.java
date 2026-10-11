public class OnlyDsaLinkedList_3 {
    // /* Question 1 --> Create and Display <------ */
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // /* Question 2 --> Add element at begining <------ */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // /* Question 3 --> Add element at last <------ */
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode = currNode;
    }

    // /* Question 4 --> Remove first <------ */
    public void delete() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // /* Question 5 --> Remove from last <------- */
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    // /* Question 6 --> Insert at position <-------- */
    public void addAtPosition(int i, int data) {
        Node newNode = new Node(data);
        if (head == null || i == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            if (count == i - 1) {
                newNode.next = currNode.next;
                currNode.next = newNode;
                return;
            }
            currNode = currNode.next;
            count++;
        }
    }

    // /* Question 7 --> Search for element in list <------- */
    public boolean search(int x) {
        if (head == null) {
            return false;
        }
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == x) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // /* Question 8 --> Reverse linked list <------- */
    public void reverseList(){
        
    }

    // /* Question 9 --> Find middle node <------- */
    public Node middleNode(Node head){
        return head;
    }

    // /* Question 10 --> Detect Cycle <------- */
    public boolean isCycle(){
        return false;
    }

    // /* Question 1 --> Create and Display <-------- */
    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("Null");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        OnlyDsaLinkedList_3 list = new OnlyDsaLinkedList_3();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(6);
        list.addLast(7);
        list.addAtPosition(4, 5);
        // list.printList();
        // list.delete();
        // list.printList();
        // list.deleteLast();
        list.printList();
        System.out.println("X is found : " + list.search(90));
    }
}
