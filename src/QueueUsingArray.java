public class QueueUsingArray {
    private int capacity;
    private int currentSize;
    private int[] queueArray;
    private int front;
    private int rear;

    // constructor

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.front = 0;
        this.rear = -1;
        this.queueArray = new int[this.capacity];
    }

    public boolean isFull() {
        return currentSize == capacity;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int newElement) {
        if (isFull()) {
            System.out.println("Queue Overflow!");
            return;
        } else if (rear == capacity - 1) {
            rear = 0;
            queueArray[rear] = newElement;
            currentSize++;
        } else {
            // increment the rear index and insert the new element at the rear index
            queueArray[++rear] = newElement;

            // increment the rear current size by 1
            currentSize++;
        }
    }

    public int dequeue() {
        // check if the queue is empty or not
        if (isEmpty()) {
            throw new RuntimeException("The queue is empty!");
        }
        // taking the element at the current front and update the new front
        int temp = queueArray[front];
        if (front == capacity - 1) {
            front = 0;
        }
        currentSize--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }
}
