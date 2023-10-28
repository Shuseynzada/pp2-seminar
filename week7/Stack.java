
public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        // TODO what is capacity is not a positive integer ?
        if(capacity > 0) this.capacity = capacity;
        else throw new IllegalArgumentException("Stack capacity cannot be negative number");
        this.index = -1;
        this.elements = new int[capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() {
        if(index > elements.length || index < 0) throw new ArrayIndexOutOfBoundsException("Index is out of range");

        return elements[index];
    }

    public int pop() {
        if(index > elements.length || index < 0) throw new ArrayIndexOutOfBoundsException("Cannot pop from empty Stack");

        return elements[index--];
    }

    public void push(int el) {
        if(index == capacity-1) throw new ArrayIndexOutOfBoundsException("Stack is out of capacity");

        elements[++index] = el;
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements[i]);
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        // stack.push(200000);

        stack.__print();
        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}
