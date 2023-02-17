class Node {
    String data;
    Node next;

    public Node(String name) {
        this.data = name;

    }

    public void setData(String d) {
        this.data = d;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }
}

class Linkedlist {
    Node head;
    Node tail;

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void addAtBegin(String data) {
        Node new_Node = new Node(data);

        if (head == null) {
            this.head = this.tail = new_Node;
        } else {
            new_Node.next = this.head;
            this.head = new_Node;
        }
    }

    public void addAtEnd(String data) {
        Node new_Node = new Node(data);

        if (head == null) {
            this.head = this.tail = new_Node;
        } else {
            this.tail.next = new_Node;
            this.tail = new_Node;

        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.getData() + " --> ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println();
    }

    public Node find(String data) {

        Node temp = head;

        while (temp != null) {
            if (temp.getData().equals(data)) {
                return temp;
            }

            temp = temp.next;
        }

        return null;

    }

    public void insert(String databefore, String data) {
        Node new_Node = new Node(data);

        Node dataBeforeNode = find(databefore);

        if (head == null)
            this.head = this.tail = new_Node;

        else {
            if ((dataBeforeNode != null)) {
                new_Node.next = dataBeforeNode.next;
                dataBeforeNode.next = new_Node;// we can also use setNext() and getNext() function
            } else {

                System.out.println("Node not Found");
            }

        }

    }

    public void delete(String data) {
        // Check if the list is empty,
        if (this.head == null)
            System.out.println("List is empty");
        else {
            // Find the node to be deleted
            Node node = this.find(data);
            // If the node is not found
            if (node == null)
                System.out.println("Node not found");
            // If the node to be deleted is the head node
            else if (node == this.head) {
                this.head = this.head.getNext();
                node.setNext(null);
                // If the node to be deleted is also the tail node
                if (node == this.tail)
                    tail = null;
            } else {
                // Traverse to the node present before the node to be deleted
                Node nodeBefore = null;
                Node temp = this.head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }
                // Remove the node
                nodeBefore.setNext(node.getNext());
                // If the node to be deleted is the tail node,
                // then make the previous node as the tail
                if (node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }
        }
    }

    public int findPosition(String data, Node head) {

        int pos = 0;

        Node temp = head;

        while (temp != null) {
            pos++;

            if (temp.getData().equals(data)) {

                return pos;

            }

            temp = temp.getNext();

        }

        return 0;

    }

    public static void shiftListLeft(Linkedlist linkedList, int n) {
        // Implement your code here

        while (n != 0) {
            linkedList.addAtEnd(linkedList.getHead().getData());
            linkedList.delete(linkedList.getHead().getData());

            n--;
        }

    }

    public static void shiftListRight(Linkedlist linkedList, int n) {
        // Implement your code here

        while (n != 0) {
            String temp = linkedList.getTail().getData();
            linkedList.delete(linkedList.getTail().getData());
            linkedList.addAtBegin(temp);

            n--;
        }
    }

}

public class MyLinkedList {
    public static void main(String[] args) {

        Linkedlist ll = new Linkedlist();
        ll.addAtEnd("1");
        ll.addAtEnd("2");
        ll.addAtEnd("3");
        ll.display();
        ll.addAtEnd("4");
        ll.addAtEnd("5");
        ll.addAtEnd("6");
        ll.display();

        // ll.insert("Ansh", "Shiwanshu");
        // ll.display();
        // System.out.println(ll.findPosition("Shiwanshu", ll.getHead()));

        // if (ll.find("Ansh") != null)
        // System.out.println("NODE Found");
        // else
        // System.out.println("NODE not found");

        Linkedlist reversedLinkedList = new Linkedlist();

        reverseList(ll.getHead(), reversedLinkedList);
        System.out.println("Reversed List");
        reversedLinkedList.display();

    };

    public static void reverseList(Node head, Linkedlist reversedLinkedList) {
        // Implement your code here

        if (head == null) {
            return;
        }

        reversedLinkedList.addAtBegin(head.getData());
        reverseList(head.getNext(), reversedLinkedList);

        // Node temp= head;

        // while(temp!=null){
        // reversedLinkedList.addAtEnd(temp.getData());

        // temp= temp.getNext();
        // }

    }

}
