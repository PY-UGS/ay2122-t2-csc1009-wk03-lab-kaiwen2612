package Stack;
import java.util.ArrayList;

public class StackOfIntegers {
    private ArrayList<Integer> elements;
    private int size;
    private int capacity;

    public StackOfIntegers() {
        this.elements = new ArrayList<Integer>();
        this.size = 0;
        this.capacity = 16;
    }

    public StackOfIntegers(int capacity) {
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int peek() {
        return this.elements.get(this.size-1);
    }

    public void push(int value) {
        this.elements.add(value);
        this.size += 1;
    }

    public int pop() {
        int element = peek();
        this.elements.remove(element);
        this.size -= 1;
        return element;
    }

    public int getSize() {
        return this.size;
    }
}
