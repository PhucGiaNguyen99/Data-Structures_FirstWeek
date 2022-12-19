import java.util.ArrayList;

public class StackUsingArray {
    ArrayList<Integer> stack;
    int topIndex = -1;
    int size;

    public StackUsingArray(int size) {
        this.size = size;
        stack = new ArrayList<>(size);
    }

    // check if the stack is full
    public boolean isFull() {
        return topIndex + 1 == size;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return topIndex == -1;
    }

    public void push(int newData) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        } else {
            // increment the top index by 1 to go to the next position
            topIndex++;
            stack.add(newData);
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack.get(topIndex);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            topIndex--;
        }
    }
}
