import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> data;

    public Stack() {

    }

    public boolean isEmpty() {

    }

    public void push(int v) {

    }

    public int size() {

    }

    public int top() {
        this.guardAgainstBeingEmpty();

        // Code here.
    }

    public int pop() {
        this.guardAgainstBeingEmpty();

        // Code here.
    }

    private void guardAgainstBeingEmpty() {
        if (this.isEmpty()) {
            throw new StackEmptyException();
        }
    }
}
