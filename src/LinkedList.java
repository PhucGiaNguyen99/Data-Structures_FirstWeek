public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getLink() == null) {
                System.out.print(currentNode.getData());
            } else {
                System.out.print(currentNode.getData() + " -> ");
            }
            currentNode = currentNode.getLink();
        }
    }

    public Node pushBack(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return newNode;
        }

        // in case: DO NOT have tail pointer
        //Node currentNode = head;
        //while (currentNode.getLink() != null) {
        //  currentNode = currentNode.getLink();
        //}
        //currentNode.setLink(newNode);
        //tail = newNode;

        // in case: have tail pointer
        tail.setLink(newNode);
        tail = newNode;
        return head;
    }

    public Node popBack() {
        // loop to the node next to the last node
        Node currentNode = this.head;
        while (currentNode.getLink().getLink() != null) {
            currentNode = currentNode.getLink();
        }
        tail = currentNode;
        currentNode.setLink(null);
        return head;
    }

    public Node pushFront(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            tail = head;
            return newNode;
        }
        newNode.setLink(head);
        head = newNode;
        return head;
    }

    public Node popFront() {
        if (head == null) {
            return null;
        } else {
            head = head.getLink();

            // pop the only node in a linked list
            if (head == null) {
                tail = null;
            }
            return head;
        }
    }

    public Node addAfter(Node node, int data) {
        Node newNode = new Node(data);
        newNode.setLink(node.getLink());
        node.setLink(newNode);

        // in case: the given node is the only one, or the final node in the linked list
        if (tail == node) {
            tail = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.pushBack(1);
        linkedList.pushBack(2);
        linkedList.pushBack(3);
        linkedList.pushBack(4);
        linkedList.pushBack(5);

        linkedList.pushFront(-10);
        linkedList.pushFront(-100);

        linkedList.popFront();
        linkedList.popFront();

        linkedList.popFront();
        linkedList.popFront();


        linkedList.printList();

        // Test push new node at the front of the linked list
        // head is not null
        //Node firstPushFront = linkedList.pushFront(0, head);
        //Node secondPushFront = linkedList.pushFront(-10, firstPushFront);
        //Node thirdPushFront = linkedList.pushFront(-100, secondPushFront);
        //Node fourthPushFront = linkedList.pushFront(-1000, thirdPushFront);

        Node head2 = null;
        // head is null
        //linkedList.printList(linkedList.pushFront(1, head2));

        //linkedList.printList(fourthPushFront);
    }


}
