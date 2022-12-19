public class StackUsingLinkedList {
    Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // push a new node into the front of the stack
    public Node push(int newData) {
        Node newNode = new Node(newData);

        if (top == null) {
            top = newNode;
            return top;
        }
        newNode.setLink(top);
        top = newNode;
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.getData();
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public Node pop() {
        if (isEmpty()) {
            return null;
        }
        top = top.getLink();
        return top;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        } else {
            Node temp = top;
            while (temp != null) {
                if (temp.getLink() != null) {
                    System.out.print(temp.getData() + "-> ");
                } else {
                    System.out.println(temp.getData());
                }
                temp = temp.getLink();
            }
        }

    }

}
