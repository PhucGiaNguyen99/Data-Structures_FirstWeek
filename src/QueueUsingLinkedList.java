public class QueueUsingLinkedList {
    private Node rear = null, front = null;
    private int currentSize = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int newElement) {
        Node newNode = new Node(newElement);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            // add the new node to the rear of queue and update rear
            rear.setLink(newNode);
            rear = newNode;
        }
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            System.exit(-1);
        }
        Node temp = front;
        front = front.getLink();

        if (isEmpty()) {
            rear = null;
        }

        currentSize--;
        return temp.getData();
    }

}
