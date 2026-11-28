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
        if (list1 == null && list2 == null) { // Case 1 if both list are empty then return null
            return null;
        }
        Node p1 = list1;
        Node p2 = list2;
        Node temp = null;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                temp = p1.next;
                p1.next = p2;
                p1 = p2;
                p2 = temp;
            }
             else {
                temp = p1.next;
                p2.next = p1;
                p2 = p1;
                p1 = temp;
            }
        }
        
        return list1;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        LinkList list2 = new LinkList();
        list1.addFirst(5);
        list1.addFirst(3);
        list1.addFirst(1);

        list2.addFirst(6);
        list2.addFirst(4);
        list2.addFirst(2);

        list1.printList();
        list2.printList();
        // list.removeVal(3);

        LinkList list3 = new LinkList();
        list3.head = list3.merge(list1.head, list2.head);
        // System.out.println(list1.head.data);
        list3.printList();
    }
}