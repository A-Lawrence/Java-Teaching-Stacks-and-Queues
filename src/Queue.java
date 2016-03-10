import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> data;

    public Queue(){

    }

    public void push(int value){

    }

    public int front(){
        this.guardAgainstBeingEmpty();

        // Code here.
    }

    public int pop(){
        this.guardAgainstBeingEmpty();

        // Code here.
    }

    public boolean isEmpty(){

    }

    public boolean isFull(){

    }

    public int size(){

    }

    private void guardAgainstBeingEmpty(){
        if(this.isEmpty()){
            throw new QueueEmptyException();
        }
    }
}
