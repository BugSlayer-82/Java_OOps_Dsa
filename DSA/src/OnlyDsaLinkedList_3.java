public class OnlyDsaLinkedList_3 {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

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

    public void addAtPosition(int i, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            if (count == i) {
                currNode.next = newNode;
                return;
            }
            currNode = currNode.next;
            count++;
        }
    }

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
        list.addAtPosition(2, 5);
        list.printList();
    }
}
