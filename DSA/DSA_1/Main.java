class LinkList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public Node merge(Node list1, Node list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        Node p1 = list1;
        Node p2 = list2;
        Node p3 = null;
        Node newNode = null;
        if (list1.data <= list2.data) {
            newNode = list1;
        } else {
            newNode = list2;
        }
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                p3 = p1.next;
                p1.next = p2;
                p1 = p1.next;
                p2 = p3;
            }
        }
        while(p1 != null){
            p1.next = p2;
            p1 = p1.next;
        }
        while(p2 != null){
            p2.next = p3;
            p2 = p2.next;
        }
        return newNode;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        LinkList list2 = new LinkList();
        list1.addFirst(5);
        list1.addFirst(3);
        list1.addFirst(1);

        list2.addFirst(2);
        list2.addFirst(4);
        list2.addFirst(6);

        list1.printList();
        list2.printList();
        // list.removeVal(3);

        list1.head = list1.merge(list1.head, list2.head);
        list1.printList();
    }
}