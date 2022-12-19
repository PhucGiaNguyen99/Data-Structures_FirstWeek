public class DoublyLinkedList {
    DNode head;
    DNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DNode pushBack(int newData) {
        DNode newDNode = new DNode(newData);

        // if the linked list is empty
        if (tail == null) {
            head = newDNode;
            tail = newDNode;
            newDNode.setPrev(null);
        } else {
            tail.setNext(newDNode);
            newDNode.setNext(tail);
            tail = newDNode;
        }
        return head;
    }

    public DNode popBack() {
        // if the linked list is empty
        if (head == null) {
            return null;
        }

        // if there is one node
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
        }
        return head;
    }

    public DNode addAfter(DNode node, int newData) {
        DNode newNode = new DNode(newData);
        newNode.setNext(node.getNext());
        newNode.setPrev(node);
        node.setNext(newNode);

        // if there are only 2 nodes already
        if (newNode.getNext() != null) {
            newNode.getNext().setPrev(newNode);
        }
        if (tail == node) {
            tail = newNode;
        }
        return head;
    }

    public DNode addBefore(DNode node, int newData) {
        DNode newNode = new DNode(newData);
        newNode.setPrev(node.getPrev());
        node.setPrev(newNode);

        // if there is one node ahead of the node
        if (newNode.getPrev() != null) {
            newNode.getPrev().setNext(newNode);
        }

        // if there is only one node
        if (head == node) {
            head = newNode;
        }

        return head;
    }


}
